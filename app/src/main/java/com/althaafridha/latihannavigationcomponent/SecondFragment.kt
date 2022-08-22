package com.althaafridha.latihannavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_second, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		view.findViewById<Button>(R.id.btn_2)
//		val flowStepNumber = 3
//		val action =
		val button = view.findViewById<Button>(R.id.btn_2)
		button.setOnClickListener{
			findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
		}
	}
}