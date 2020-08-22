package com.visfordev.project_uc_rev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BOTÃO GO TO SCHEDULED ACTIVITIES
        ButtonGoToScheduleActivities.setOnClickListener {
             openNextActvity()
        }
    }
        //FUNÇÃO PARA ABRIR A PRÓXIMA ATIVIDADE
    private fun openNextActvity() {
        val intent = Intent(this, ScheduledActivities::class.java)
             startActivity(intent)
    }
}