package com.example.gyun_home.viewpager_kotlin

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import kotlinx.android.synthetic.main.fragment_9.view.*
import java.util.*

class F9_Date_Time_Picker : Fragment(){
    var cal = Calendar.getInstance()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_9,container,false)

        view.btn_date.setOnClickListener {

            showDatePicker()

        }

        view.btn_time.setOnClickListener {
            showTimePicker()
        }

        return view
    }

    fun showDatePicker(){
        DatePickerDialog(context,DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

            Log.e("date",year.toString())
            Log.e("date",(monthOfYear+1).toString())
            Log.e("date",dayOfMonth.toString())

        },cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DATE)).show()

    }

    fun showTimePicker(){

        TimePickerDialog(context,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

            Log.e("date",hourOfDay.toString())
            Log.e("date",minute.toString())

        } ,cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE),true).show()
    }
}