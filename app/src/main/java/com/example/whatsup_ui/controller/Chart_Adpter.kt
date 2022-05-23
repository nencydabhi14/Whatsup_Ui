package com.example.whatsup_ui.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsup_ui.Fragment.Chart_Fragment
import com.example.whatsup_ui.R


class Chart_Adpter(
    val activity: FragmentActivity?,
    val chartFragment: Chart_Fragment,
    val a1: Array<String>,
    val ms: Array<String>,
    val img: Array<Int>,
    val time: Array<String>
) :
    RecyclerView.Adapter<Chart_Adpter.ViewData>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {


        var view = LayoutInflater.from(activity).inflate(R.layout.rv_item, parent, false)
        return ViewData(view)

    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.txt_rv_item1.text = a1[position]
        holder.txt_rv_item2.text = ms[position]
        holder.txt_rv_item3.text = time[position]
        holder.img_rv_item.setImageResource(img[position])
        holder.txt_rv_item1.setOnClickListener {

            val a3=a1[position]
            if ( a3.equals(a1[0])) {

                Toast.makeText(activity, ""+a1[0], Toast.LENGTH_SHORT).show()


            }
            else if( a3.equals(a1[1]))
            {

                Toast.makeText(activity, ""+a1[1], Toast.LENGTH_SHORT).show()

            }
            else if( a3.equals(a1[2]))
            {


                Toast.makeText(activity, ""+a1[2], Toast.LENGTH_SHORT).show()

            }

            else {
                Toast.makeText(activity, "Soming Soon...", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun getItemCount(): Int {

        return a1.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txt_rv_item1 = itemView.findViewById<TextView>(R.id.txt_rv_item1)
        val txt_rv_item2 = itemView.findViewById<TextView>(R.id.txt_rv_item2)
        val txt_rv_item3 = itemView.findViewById<TextView>(R.id.txt_rv_item3)
        val img_rv_item = itemView.findViewById<ImageView>(R.id.img_rv_item)

    }
}