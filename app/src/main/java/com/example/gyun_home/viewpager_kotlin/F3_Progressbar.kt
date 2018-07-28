package com.example.gyun_home.viewpager_kotlin

import android.os.AsyncTask
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_3.*
import kotlinx.android.synthetic.main.fragment_3.view.*

class F3_Progressbar : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_3,container,false)

        view.f3_btn.setOnClickListener {

            progressBar1.visibility = View.VISIBLE
        }

        view.f3_brn2.setOnClickListener {

            var i = 0

            object : AsyncTask<Void,Void,Void>(){
                override fun doInBackground(vararg params: Void?): Void? {

                    while(i <= 100){

                        view.progressbar2.setProgress(i)
                        i++
                        Thread.sleep(100)
                    }

                    return null
                }


            }.execute()

        }

        return view
    }
}