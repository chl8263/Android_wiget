package com.example.gyun_home.viewpager_kotlin

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_7.view.*

class F7_SuefaceView : Fragment(), SurfaceHolder.Callback, MediaPlayer.OnPreparedListener {


    var surfaceHolder: SurfaceHolder? = null
    var mediaplayer: MediaPlayer? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_7, container, false)

        surfaceHolder = view.surfaceView.holder
        surfaceHolder!!.addCallback(this)

        view.back.setOnClickListener {

            var position = mediaplayer!!.currentPosition - 5000
            mediaplayer!!.seekTo(position)
        }

        view.fast.setOnClickListener {
            var position = mediaplayer!!.currentPosition + 5000
            mediaplayer!!.seekTo(position)
        }
        view.stop.setOnClickListener {
            mediaplayer!!.pause()
        }
        view.start.setOnClickListener {
            var position = mediaplayer!!.currentPosition - 5000
            mediaplayer!!.start()
        }

        return view
    }


    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) { //서피스 안에 데이터 변경될때 예를들어 스캐치가 그려질때
    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) { //서피스 종료될때
    }

    override fun surfaceCreated(holder: SurfaceHolder?) {   //서피스뷰가 생성이 될때
        var url = "https://www.rmp-streaming.com/media/bbb-360p.mp4"
        mediaplayer = MediaPlayer()
        mediaplayer!!.setDisplay(holder)
        mediaplayer!!.setDataSource(url)
        mediaplayer!!.prepare()
        mediaplayer!!.setOnPreparedListener(this)

    }

    override fun onPrepared(mp: MediaPlayer?) {     //서비스뷰가 준비되었을때 스캐치가 아니라 영상전용
        mediaplayer!!.start()
    }
}