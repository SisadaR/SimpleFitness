package com.jkhome.simplefitness

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class WellDoneFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_well_done, container, false)
        view.findViewById<Button>(R.id.restart_button).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_wellDoneFragment_to_exerciseFragment)
        )
        return view
    }


}