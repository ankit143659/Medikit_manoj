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

        val view: View = inflater.inflate(R.layout.fragment_home__main, container, false)
        val dr = view.findViewById<LinearLayout>(R.id.d1);

        dr.setOnClickListener {
            val intent = Intent(requireContext(), doctor::class.java)
            requireContext().startActivity(intent)
        }
        val medical = view.findViewById<LinearLayout>(R.id.store);

        medical.setOnClickListener {
            val i = Intent(requireContext(), Medical_form::class.java)
            requireContext().startActivity(i)

        }
        return view

    }
}





