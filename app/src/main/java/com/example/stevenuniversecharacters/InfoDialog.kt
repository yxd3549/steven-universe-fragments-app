package com.example.fragmentfinalexample

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class InfoDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity)
            .setTitle("About")
            .setMessage("This app displays characters from the Cartoon Network show Steven Universe. " +
                    "Author: Yancarlos Diaz")
            .create()
    }
}