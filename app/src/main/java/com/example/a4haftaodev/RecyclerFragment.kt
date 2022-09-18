package com.example.a4haftaodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a4haftaodev.databinding.FragmentHomeragmentBinding
import com.example.a4haftaodev.databinding.FragmentRecyclerBinding


class RecyclerFragment : Fragment() {
private lateinit var fragmentrecyclerBinding:FragmentRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     fragmentrecyclerBinding=FragmentRecyclerBinding.inflate(inflater)
        return fragmentrecyclerBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentrecyclerBinding.apply {
            ImageView.setOnClickListener {
                findNavController().navigate(R.id.action_recyclerFragment_to_recyclerFullFragment) }
        }
    }

}
