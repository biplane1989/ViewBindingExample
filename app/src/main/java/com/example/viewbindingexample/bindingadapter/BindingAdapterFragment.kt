package com.example.viewbindingexample.bindingadapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProviders
import com.example.viewbindingexample.R
import com.example.viewbindingexample.databinding.FragmentBindingAdapterBinding
import com.example.viewbindingexample.databinding.FragmentDataBindingBinding

class BindingAdapterFragment : Fragment() {

    private var _binding: FragmentBindingAdapterBinding? = null

    private val binding get() = _binding!!
    private val bindingViewModel: BindingViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentBindingAdapterBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.data = bindingViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.ivBinding.setBackgroundColor()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}