package com.example.whatsup_ui.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsup_ui.R
import com.example.whatsup_ui.controller.Chart_Adpter

class Chart_Fragment : Fragment() {

    lateinit var rv_view1: RecyclerView
    var a1 = arrayOf(
        "Tina",
        "Mina",
        "Dinesh",
        "Divyesh",
        "Yash",
        "Rajnik",
        "Mukesh",
        "meet",
        "Jenish",
        "Manv",
        "ronak",
        "Priyal",
        "Jenish"
    )
    var ms = arrayOf(
        "image",
        "ok",
        "no chating",
        "oo",
        "hi ",
        "pdf",
        "new",
        "how are you",
        "last seen",
        "ok!!",
        "hi",
        "new ",
        "how can you"
    )
    var time = arrayOf(
        "10:00 PM",
        "11:29 AM",
        "4:00Am",
        "12:00 Am",
        "4:30 PM",
        "5:00 PM",
        "3:30 PM",
        "3:31 PM",
        "YesterDay",
        "YesterDay",
        "YesterDay",
        "YesterDay",
        "YesterDay",

        )
    var img = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img5,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img1,
        R.drawable.img5,
        R.drawable.img2,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view = inflater.inflate(R.layout.fragment_chart_, container, false)
        rv_view1 = view.findViewById<RecyclerView>(R.id.rv_view1)


        var adpter1 = Chart_Adpter(activity, this, a1, ms, img, time)
        var layoutManager1 = LinearLayoutManager(activity)
        rv_view1.layoutManager = layoutManager1
        rv_view1.adapter = adpter1
        return view

    }


}