package com.example.gyun_home.viewpager_kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class F11_MapFragment : Fragment(){         //구글은 24시간당 1000개의 요청은 무료

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_11,container,false)

        return view
    }
}