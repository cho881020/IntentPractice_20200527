package kr.co.tjoeun.intentpractice_20200527

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_MESSAGE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFourthBtn.setOnClickListener {
            val myIntent = Intent(this, FourthActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_MESSAGE)
        }

        goToSecondBtn.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)

        }

        goToFirstBtn.setOnClickListener {
            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }

        goToThirdBtn.setOnClickListener {

            val content = contentEdt.text.toString()

            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("input", content)
            myIntent.putExtra("number", 10)
            startActivity(myIntent)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.d("액티비티복귀", "결과를 가지고 돌아옴")

        if (requestCode == REQ_FOR_MESSAGE) {
            if (resultCode == Activity.RESULT_OK) {
                val message = data?.getStringExtra("message")

                resultTxt.text = message

            }
        }

    }

}
