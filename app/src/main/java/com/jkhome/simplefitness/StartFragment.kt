package com.jkhome.simplefitness

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class StartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val v = inflater.inflate(R.layout.fragment_start, container, false)

        val goButton = v.findViewById<Button>(R.id.go_button)
        goButton.setOnClickListener { view:View ->
            Navigation.findNavController(view).navigate(R.id.action_startFragment_to_exerciseFragment)
        }
        return v
    }


}