package com.jkhome.simplefitness

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class TryAgainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_try_again, container, false)
        view.findViewById<Button>(R.id.restart_button).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_tryAgainFragment2_to_exerciseFragment)
        )
        return view
    }

}