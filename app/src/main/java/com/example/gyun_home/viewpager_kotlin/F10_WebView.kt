package com.example.gyun_home.viewpager_kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import kotlinx.android.synthetic.main.fragment_10.*
import kotlinx.android.synthetic.main.fragment_10.view.*

class F10_WebView : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_10,container,false)

        view.webView.webChromeClient = WebChromeClient()

        view.btn_naver.setOnClickListener {
            view.webView.loadUrl("https://www.naver.com")
        }

        view.button_daum.setOnClickListener {
            view.webView.loadUrl("https://www.daum.net")

        }
        view.btn_google.setOnClickListener {

            view.webView.loadUrl("https://www.google.com")
        }


        return view
    }
}