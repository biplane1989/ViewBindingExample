package com.example.viewbindingexample.databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.example.viewbindingexample.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DataBindingFragment : Fragment() {

    private var _binding: FragmentDataBindingBinding? = null
    private val binding get() = _binding!!
    private val observableViewModel: ObservableViewModel by viewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentDataBindingBinding.inflate(inflater, container, false)
        binding.data = observableViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}