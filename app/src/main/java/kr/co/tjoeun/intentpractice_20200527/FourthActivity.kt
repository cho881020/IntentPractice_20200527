package kr.co.tjoeun.intentpractice_20200527

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        goBackBtn.setOnClickListener {

            val input = goBackMessageEdt.text.toString()

            val goBackIntent = Intent()
            goBackIntent.putExtra("message", input)

            setResult(Activity.RESULT_OK, goBackIntent)

            finish()

        }

    }
}
