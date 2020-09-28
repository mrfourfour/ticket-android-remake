package kr.ac.jejunu.ticketremake.ui.main_ticket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kr.ac.jejunu.ticketremake.R
import kr.ac.jejunu.ticketremake.databinding.ActivityMainTicketBinding

private lateinit var binding : ActivityMainTicketBinding
class MainTicket :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_ticket)
    }
}