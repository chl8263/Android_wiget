package com.example.gyun_home.viewpager_kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_2.*
import kotlinx.android.synthetic.main.fragment_2.view.*

class F2_spinner : Fragment(){
    var countries = arrayOf("한국","미국")
    var city_korea = arrayOf("서울","대전","부산")
    var city_usa = arrayOf("뉴욕","워싱턴","로스앤젤레스")

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view  = inflater!!.inflate(R.layout.fragment_2,container,false)

        var countryAdapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_dropdown_item,countries)

        view.myspinner1.adapter = countryAdapter

        view.myspinner1.onItemSelectedListener =  object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view2: View?, position: Int, id: Long) {

                var country = parent!!.getItemAtPosition(position)

                if(country == "한국"){
                    var adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_dropdown_item,city_korea)
                    view.myspinner2.adapter = adapter
                }else if(country == "미국") {
                    var adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_dropdown_item,city_usa)
                    view.myspinner2.adapter = adapter
                }
            }


        }

        view.myspinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var country = parent!!.getItemAtPosition(position).toString()

                Toast.makeText(context,country+ "를 선택 하였습니다",Toast.LENGTH_SHORT).show()

            }


        }

        return view
    }
}