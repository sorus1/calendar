package com.smastcomm.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.Toast
import com.smastcomm.calendar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding

    lateinit var dateTV: TextView
    lateinit var calendarView: CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)


        dateTV = findViewById(R.id.idTVDate)
        calendarView = findViewById(R.id.calendarView)


        calendarView
            .setOnDateChangeListener(
                OnDateChangeListener { view, year, month, dayOfMonth ->
                    val months = listOf(
                        "Января",
                        "Февраля",
                        "Марта",
                        "Апреля",
                        "Мая",
                        "Июня",
                        "Июля",
                        "Августа",
                        "Сентября",
                        "Октября",
                        "Ноября",
                        "Декабря"
                    )

                    val Date = (dayOfMonth.toString() + " "
                            + (months.get(month + 0)) + " " + year)


                    dateTV.setText(Date)
                })

    bind.button1.setOnClickListener{
        Toast.makeText(this, "Данное приложение сделано студентом группы 20-КИС-2 Машановым Русланом Андреевичем", Toast.LENGTH_SHORT).show()
    }

    }
}