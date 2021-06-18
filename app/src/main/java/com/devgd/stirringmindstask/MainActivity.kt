package com.devgd.stirringmindstask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onBackPressed() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert!")
        builder.setMessage("Transaction is going on. if you close the app te transaction will be failed")


        builder.setPositiveButton("anyway, close") { dialog, which ->

            super.onBackPressed()
        }

        builder.setNegativeButton("don't close") { dialog, which ->
         
        }


        builder.show()
    }


}