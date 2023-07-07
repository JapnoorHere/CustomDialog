package com.droidbytes.customdialog

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.droidbytes.customdialog.databinding.CustomDialogBinding

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.opendDialog)

        btn.setOnClickListener {
            val dialog = Dialog(this@MainActivity)
            val dialogBinding = CustomDialogBinding.inflate(layoutInflater)
            dialog.setContentView(dialogBinding.root)
            dialog.show()

            dialog.setCancelable(false)

            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            dialog.window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT)

            dialogBinding.btn.setOnClickListener {
                dialog.hide()
            }

        }

    }
}