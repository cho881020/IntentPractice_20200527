package kr.co.tjoeun.intentpractice_20200527

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goBackBtn.setOnClickListener {

//            돌아갈때는 Intent로 돌아가지 않는다.
//            Intent는 새로 화면을 만들어내는 효과가있기때문.

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            finish()

        }

    }
}
