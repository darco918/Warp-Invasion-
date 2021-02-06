package com.example.warpinvasion30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.telecom.Call
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_log_in.*
import retrofit2.Response
import javax.security.auth.callback.Callback

class LogInActivity : AppCompatActivity() {
    var list = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("gamertag", username.text)
            val user = User(0, username.text.toString(), password.text.toString(), 1, 1, 1)
           // getUser(user)
             startActivity(intent)
        }}

    val retrofitClient = Client
        .getRetrofitInstance("http://10.0.2.2:3000/")

private fun getUser(user: User) {
    val retrofitClient = Client
        .getRetrofitInstance("http://10.0.2.2:3000/")
    val endpoint = retrofitClient.create(Routes::class.java)
    //val callback = endpoint.login()
    endpoint.getUser(user).enqueue(
        object : retrofit2.Callback<User> {
            override fun onResponse(call: retrofit2.Call<User>, response: Response<User>) {

              //  println(response.body().user_name)
                  val intent = Intent(this@LogInActivity, MainActivity::class.java)
                   intent.putExtra("gamertag","darco" )

                   startActivity(intent)

            }

            override fun onFailure(call: retrofit2.Call<User>, t: Throwable) {
                // Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }
        }
    )
}

}


