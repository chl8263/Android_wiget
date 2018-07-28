package com.example.gyun_home.viewpager_kotlin

import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_8.view.*

class F8_dialog : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_8,container,false)

        view.f8_btn.setOnClickListener {
            showDialog()

        }

        return view
    }

    fun showDialog(){
        var builder = AlertDialog.Builder(context)
        builder.setTitle("알림")
        builder.setMessage("앱을 종료 하시겟습니까")
        builder.setPositiveButton("예", DialogInterface.OnClickListener { dialog, which -> activity.onBackPressed() })
        builder.setNegativeButton("아니오", DialogInterface.OnClickListener { dialog, which ->  dialog.dismiss()}).show()
    }
}