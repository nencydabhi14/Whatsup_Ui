package com.example.whatsup_ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.whatsup_ui.controller.Tabview_Adapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var tab_view: TabLayout
    lateinit var pager_view: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blinding()
        tab_view.addTab(tab_view.newTab().setText("chat"))
        tab_view.addTab(tab_view.newTab().setText("status"))
        tab_view.addTab(tab_view.newTab().setText("call"))


        var adpter1 = Tabview_Adapter(this, supportFragmentManager)
        pager_view.adapter = adpter1


        pager_view.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_view))
        tab_view.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {

                pager_view.currentItem = tab!!.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

    fun blinding() {

        tab_view = findViewById<TabLayout>(R.id.tab_view)
        pager_view = findViewById<ViewPager>(R.id.pager_view)
    }
}