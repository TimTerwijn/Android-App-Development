package nl.terwijn.individualassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    private fun init() {
        btnLogin.setOnClickListener { startFeedbackOverview() }
    }

    private fun startFeedbackOverview(){
        val intent = Intent(this, FeedbackOverviewActivity::class.java)
        startActivity(intent)
    }
}