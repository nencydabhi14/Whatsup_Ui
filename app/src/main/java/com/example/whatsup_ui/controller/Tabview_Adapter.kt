package com.example.whatsup_ui.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsup_ui.Fragment.Call_Fragment
import com.example.whatsup_ui.Fragment.Chart_Fragment
import com.example.whatsup_ui.Fragment.Status_Fragment
import com.example.whatsup_ui.MainActivity

class Tabview_Adapter(mainActivity: MainActivity, supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(
        supportFragmentManager
    ) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {

            0->Chart_Fragment()
            1->Status_Fragment()
            else -> Call_Fragment()
        }
    }


}