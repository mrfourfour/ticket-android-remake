package kr.ac.jejunu.ticketremake.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.ac.jejunu.ticketremake.ui.main_ticket.MainTicket

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashIntent = Intent(this, MainTicket::class.java)
        startActivity(splashIntent)
        finish()
    }
}