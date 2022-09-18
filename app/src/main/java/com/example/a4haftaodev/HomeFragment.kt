package com.example.a4haftaodev


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.navigation.fragment.findNavController
import com.example.a4haftaodev.databinding.FragmentHomeragmentBinding



class HomeFragment : Fragment() {
private lateinit var fragmenethomeBinding:FragmentHomeragmentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmenethomeBinding=FragmentHomeragmentBinding.inflate(inflater)
        return fragmenethomeBinding.root

      /*  private String getColoredSpanned(String hometext, String color) {
            String input = "<font color=" + color + ">" + text + "</font>";
            return input;
        }
        TextView txtView = (TextView)findViewById(R.id.hometext);
        hometext.setText(Html.fromHtml(name+" "+surName));*/
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    fragmenethomeBinding.apply {
            letsgoo.setOnClickListener {
                findNavController().navigate(R.id.action_homeragment_to_recyclerFragment) }

        }
    }



}


