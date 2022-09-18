package com.example.a4haftaodev

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


class Clothsadapter (private val list:List<ClothsModel>
//private val onItemClickHandler:(clothsModel:ClothsModel) ->Unit
):  RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): RecyclerView.ViewHolder{

        val clothesBinding= DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),R.layout.fragment_recycler,parent,false
        )
        return Clothviewholder(clothesBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position:Int) {
        (holder as Clothviewholder).onBind(list[position])
    }

    override fun getItemCount(): Int {
        return  list.size
    }

}