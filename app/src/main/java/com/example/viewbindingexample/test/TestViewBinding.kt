package com.example.viewbindingexample.test

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.viewbindingexample.R
import com.example.viewbindingexample.databinding.FragmentTestViewBindingBinding
import com.example.viewbindingexample.databinding.ObservableViewModel

class TestViewBinding : Fragment() {

    private var _binding: FragmentTestViewBindingBinding? = null
    private val binding get() = _binding!!

    private val testViewModel: TestViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentTestViewBindingBinding.inflate(inflater, container, false)
        binding.viewModel = testViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivBinding.setBackgroundColor(Color.parseColor("#ffffff"))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}