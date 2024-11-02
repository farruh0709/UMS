package com.example.ilhomjon.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ilhomjon.databinding.ItemRvBinding
import com.example.ilhomjon.models.MyInfo

class MyInfoAdapters(var rvAction: RvAction, var list:List<MyInfo>): RecyclerView.Adapter<MyInfoAdapters.Vh>() {

    inner class Vh(var itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(myInfo: MyInfo){
            itemRvBinding.tvName.text = myInfo.name
            itemRvBinding.tvUssd.text = myInfo.ussdCode
            itemRvBinding.tvAbout.text = myInfo.about
            itemRvBinding.root.setOnClickListener {
                rvAction.itemClick(myInfo)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    interface RvAction{
        fun itemClick(myInfo: MyInfo)
    }
}