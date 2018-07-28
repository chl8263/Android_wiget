package com.example.gyun_home.viewpager_kotlin

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import kotlinx.android.synthetic.main.fragment_6.view.*

class F6_VidioView : Fragment() ,OnFocusListenable{


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_6,container,false)

        var url = Uri.parse("https://www.rmp-streaming.com/media/bbb-360p.mp4")

        view.videoView.setVideoURI(url)
        view.videoView.start()

        var controller = MediaController(context)
        view.videoView.setMediaController(controller)



        return view
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {

    }


}