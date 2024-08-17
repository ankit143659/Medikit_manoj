package com.example.minorproject_resumebuilder

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class home_Main : Fragment(R.layout.fragment_home__main) {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_home__main, container, false)

        val manoj : LinearLayout = view.findViewById(R.id.d1)
        manoj.setOnClickListener {
            val intent = Intent(requireContext(), Doctor_form::class.java)
            startActivity(intent)
        }

        return view
    }

}





