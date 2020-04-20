package com.techtwice.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //When Clicked Button This Will be Run
        btGetAge.setOnClickListener {

            val myDOB : String = etDOB.text.toString();

            if (myDOB == ""){

                tvShowAge.text = "Invalid Input"
                return@setOnClickListener
            }else if (myDOB.toInt() == 0){
                tvShowAge.text = "Invalid Input"
                return@setOnClickListener
            }


            val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR);

            val myCurrentAge = currentYear - myDOB.toInt();
            tvShowAge.text = "My Age is $myCurrentAge";



        }


    }
}
