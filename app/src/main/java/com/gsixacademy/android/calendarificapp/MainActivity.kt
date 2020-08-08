package com.gsixacademy.android.calendarificapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gsixacademy.android.calendarificapp.api.CalendarApi
import com.gsixacademy.android.calendarificapp.api.ServiceBuilder
import com.gsixacademy.android.calendarificapp.models.CalendarResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val request = ServiceBuilder.buildService(CalendarApi::class.java)
        val call = request.getHolidays("37b33d72e7e27eb0375494553844fde7d1c68cd8","MK",1989)
        call.enqueue(object : Callback<CalendarResponse>{
            override fun onFailure(call: Call<CalendarResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity,t.message,Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<CalendarResponse>,
                response: Response<CalendarResponse>
            ) {
                if (response.isSuccessful){
                    val holidayResult = response.body()
                    val holidayList = holidayResult?.response?.holidays
                    if (holidayList != null){
                        text_view_description.text =
                    }


                }
            }
        })
    }
}
