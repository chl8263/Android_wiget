package com.example.gyun_home.viewpager_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        myViewPager.adapter = ViewpagerAdapter(supportFragmentManager)

        myTabLayout.addTab(myTabLayout.newTab().setText("1"))
        myTabLayout.addTab(myTabLayout.newTab().setText("2"))
        myTabLayout.addTab(myTabLayout.newTab().setText("3"))
        myTabLayout.addTab(myTabLayout.newTab().setText("4"))
        myTabLayout.addTab(myTabLayout.newTab().setText("5"))
        myTabLayout.addTab(myTabLayout.newTab().setText("6"))
        myTabLayout.addTab(myTabLayout.newTab().setText("7"))
        myTabLayout.addTab(myTabLayout.newTab().setText("8"))
        myTabLayout.addTab(myTabLayout.newTab().setText("9"))
        myTabLayout.addTab(myTabLayout.newTab().setText("10"))
        myTabLayout.addTab(myTabLayout.newTab().setText("11"))

        myTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                myViewPager.setCurrentItem(tab!!.position)
            }


        })

        myViewPager.addOnPageChangeListener(object : TabLayout.TabLayoutOnPageChangeListener(myTabLayout){})
    }

    class ViewpagerAdapter(fm:android.support.v4.app.FragmentManager) : FragmentStatePagerAdapter(fm){

        var fragments = arrayOf(F1_RecyclerView(),F2_spinner(),F3_Progressbar(),F4_ScrollView(),F5_SeekBar(),F6_VidioView(),F7_SuefaceView(),F8_dialog(),F9_Date_Time_Picker(),F10_WebView(),F11_MapFragment())

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        override fun getCount(): Int {
            return fragments.size
        }


    }

    // 풀스크린 적용코드
    /*override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN)
        }
    }*/
}
