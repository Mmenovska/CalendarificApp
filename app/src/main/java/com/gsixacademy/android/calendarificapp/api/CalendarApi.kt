package com.gsixacademy.android.calendarificapp.api

import com.gsixacademy.android.calendarificapp.models.CalendarResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CalendarApi {

    @GET("/holidays?")
    fun getHolidays (@Query("api_key") api_key : String?, @Query("country") country : String?, @Query("year") year : Number?) : Call<CalendarResponse>
}