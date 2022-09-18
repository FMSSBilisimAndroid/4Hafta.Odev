package com.example.a4haftaodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a4haftaodev.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main2)

        val list= listOf(
            ClothsModel(R.drawable.rectangle_5),
            ClothsModel(R.drawable.rectangle_4),
            ClothsModel(R.drawable.rectangle_2),
            ClothsModel(R.drawable.rectangle_6),
            ClothsModel(R.drawable.rectangle_7),
            ClothsModel(R.drawable.rectangle_8),
            ClothsModel(R.drawable.rectangle_9),
            ClothsModel(R.drawable.rectangle_10)
            )

        val adapter=Clothsadapter(list)
        val gridLayoutManager= GridLayoutManager(this,2)
        binding.RecyclerView.layoutManager=gridLayoutManager
        binding.setVariable(BR.adapter,adapter)
    }
}