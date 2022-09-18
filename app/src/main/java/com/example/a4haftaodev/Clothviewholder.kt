package com.example.a4haftaodev

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.a4haftaodev.databinding.FragmentRecyclerBinding

class Clothviewholder (
    val clothsBinding: ViewDataBinding,
 //   private val onItemClickHandler:(clothsModel:ClothsModel) ->Unit
): RecyclerView.ViewHolder(clothsBinding.root){

    fun onBind(clothsModel: ClothsModel){
        val binding = clothsBinding as FragmentRecyclerBinding
       binding.clothsModel=clothsModel
       // clothsBinding.setVariable(BR.ClothsModel,clothsModel)
    }


}