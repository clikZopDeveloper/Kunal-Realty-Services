package com.example.kunal_realty_services.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kunal_realty_services.Model.MenuModelBean
import com.example.kunal_realty_services.R
import com.example.kunal_realty_services.Utills.RvStatusClickListner


class DashboardAdapter(
    var context: Activity,
    var list: List<MenuModelBean>,
    var rvClickListner: RvStatusClickListner
) : RecyclerView.Adapter<DashboardAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder { // infalte the item Layout
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_dashboard, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setIsRecyclable(false)

        /*     holder.tvAdd.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(20f))
             holder.tvQtyAdd.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(100f))
             holder.tvQtyMinus.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(100f))
             holder.tvQty.background = RoundView(Color.TRANSPARENT, RoundView.getRadius(20f), true, R.color.orange)
             holder.tvOff.background = RoundView(context.resources.getColor(R.color.orange), RoundView.getRadius(20f))
             holder.tvAdd.visibility = View.VISIBLE*/

        holder.tvTitle.text = list[position].title
        holder.tvAmount.text = list[position].subTitle

        holder.itemView.setOnClickListener {
              rvClickListner.clickPos("",list[position].indexId)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val tvTitle: TextView = itemview.findViewById(R.id.tvTitle)
        val tvAmount: TextView = itemview.findViewById(R.id.tvAmount)

    }

}