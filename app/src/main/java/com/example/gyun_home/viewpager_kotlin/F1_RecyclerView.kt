package com.example.gyun_home.viewpager_kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*
import java.util.zip.Inflater

class F1_RecyclerView : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_1,container,false)

        view.f1_recyclerView.adapter = F1_RecyclerViewAdapter()
        view.f1_recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    class F1_RecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

        var images = arrayOf(R.drawable.one,R.drawable.two,R.drawable.one,R.drawable.two)
        var titles = arrayOf("one","one1","one2","one3")
        var sub_titles = arrayOf("two","two1","two2","two3")

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
            var view = LayoutInflater.from(parent!!.context).inflate(R.layout.recyclerciew_item,parent,false)

            return CustomViewHolder(view)
        }



        override fun getItemCount(): Int {
            return images.size
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
            var view = holder as CustomViewHolder

            view.imageview!!.setImageResource(images[position])
            view.textview1!!.text = titles[position]
            view.textview2!!.text = sub_titles[position]
        }

        class CustomViewHolder(view: View?) : RecyclerView.ViewHolder(view) {

            var imageview : ImageView? = null
            var textview1 : TextView? = null
            var textview2 : TextView? = null

            init {
                imageview = view!!.findViewById(R.id.f1_item_imageView1)
                textview1 = view!!.findViewById(R.id.f1_item_textView1)
                textview2 = view!!.findViewById(R.id.f1_item_textView2)
            }

        }


    }
}