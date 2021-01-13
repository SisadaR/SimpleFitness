package com.jkhome.simplefitness

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.jkhome.simplefitness.databinding.FragmentExerciseBinding

//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
///**
// * A simple [Fragment] subclass.
// * Use the [ExerciseFragment.newInstance] factory method to
// * create an instance of this fragment.
// */
class ExerciseFragment : Fragment() {


    data class Exercise(
        val exerciseType: String,
        val exerciseCount: Int
    )

    private val exercises: MutableList<Exercise> = mutableListOf(
        Exercise("gifone",5),
        Exercise("giftwo",9),
        Exercise("gifthree",4),
        Exercise("giffour",6),
        Exercise("giffive",8)
    )

    private val binding: FragmentExerciseBinding by lazy { FragmentExerciseBinding.inflate(layoutInflater) }
    private lateinit var currentExercise: Exercise
    private var exerciseIndex : Int = 0
    private var exerciseSize = exercises.size / 2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        randomExercise()
        binding.nextButton.setOnClickListener { view:View ->
            exerciseIndex++
            if (exerciseIndex < exerciseSize) {
                currentExercise = exercises[exerciseIndex]
                setExercise()
            } else {

            }
        }

        return binding.root

    }

    private fun randomExercise() {
        exercises.shuffle()
        exerciseIndex = 0
        setExercise()
    }

    private fun setExercise() {
        currentExercise = exercises[exerciseIndex]
        binding.exerciseTextView.text = String.format("%d Time", currentExercise.exerciseCount)
        binding.exerciseImageView.setImageResource(
            resources.getIdentifier(currentExercise.exerciseType,
            "drawable",
            (activity as AppCompatActivity).packageName))

        (activity as AppCompatActivity).supportActionBar?.title =
            String.format("%d/%d",
                exerciseIndex + 1,
                exerciseSize )



    }


}