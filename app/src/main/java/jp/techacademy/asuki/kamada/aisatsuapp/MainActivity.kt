package jp.techacademy.asuki.kamada.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog
import android.widget.TimePicker

class MainActivity : AppCompatActivity(), View.OnClickListener{




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        showTimePickerDialog()
       // textView.text = TimePickerDialog.text.toInt()
    }





    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")
                    if(2<= hour && hour <10 ){
                        Log.d("UI_PARTS", "おはよう")
                    } else if(10<= hour && hour <18){
                    Log.d("UI_PARTS", "こんにちは")
                }   else{
                    Log.d("UI_PARTS", "こんばんは")
                }
                },
                13, 0, true)
        timePickerDialog.show()

    }


}
