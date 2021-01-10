package com.example.warpinvasion30

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_layout.*
import kotlinx.android.synthetic.main.dialog_layout.view.*

class CustomDialogFragment:  DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView: View = inflater.inflate(R.layout.dialog_layout, container, false)

        rootView.cancelButtonDialog.setOnClickListener{
            dismiss()
        }

        rootView.confirmButtonDialog.setOnClickListener {
            Toast.makeText(context, "You equipped this item", Toast.LENGTH_SHORT).show()
        }

        return  rootView
    }
}