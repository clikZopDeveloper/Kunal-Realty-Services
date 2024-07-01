package com.example.kunal_realty_services.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kunal_realty_services.Model.GetExpensesBean
import com.example.kunal_realty_services.R
import com.example.kunal_realty_services.Utills.RvStatusClickListner
import com.stpl.antimatter.Utils.ApiContants


class GetExpenseAdapter(
    var context: Activity,
    var list: List<GetExpensesBean.Data>,
    var rvClickListner: RvStatusClickListner
) : RecyclerView.Adapter<GetExpenseAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder { // infalte the item Layout
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_expenses, parent, false)
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

        holder.tvDate.text = list[position].createdAt
        holder.tvName.text = list[position].name
        holder.tvPaymentMode.text = list[position].paymentMode
        holder.tvCat.text = list[position].expenseCategory
        holder.tvSubCat.text = list[position].expenseSubcategory
        holder.tvVendorName.text = list[position].vendorName
        holder.tvExpenseType.text = list[position].expenseType
        holder.tvBuildType.text = list[position].build
        holder.tvNote.text = list[position].note
        holder.tvAmount.text = ApiContants.currency+list[position].amount

        holder.itemView.setOnClickListener {
            //  rvClickListner.clickPos(list[position].indexId)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val tvDate: TextView = itemview.findViewById(R.id.tvDate)
        val tvName: TextView = itemview.findViewById(R.id.tvName)
        val tvPaymentMode: TextView = itemview.findViewById(R.id.tvPaymentMode)
        val tvCat: TextView = itemview.findViewById(R.id.tvCat)
        val tvSubCat: TextView = itemview.findViewById(R.id.tvSubCat)
        val tvVendorName: TextView = itemview.findViewById(R.id.tvVendorName)
        val tvExpenseType: TextView = itemview.findViewById(R.id.tvExpenseType)
        val tvBuildType: TextView = itemview.findViewById(R.id.tvBuildType)
        val tvNote: TextView = itemview.findViewById(R.id.tvNote)
        val tvAmount: TextView = itemview.findViewById(R.id.tvAmount)
    }

}