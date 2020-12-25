package com.example.viewbindingexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewbindingexample.databinding.FragmentHomeBinding
import com.example.viewbindingexample.databinding.FragmentViewBindingBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnViewBinding.setOnClickListener(View.OnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewBindingFragment()
            findNavController().navigate(action)
        })

        binding.btnDataBinding.setOnClickListener(View.OnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToDataBindingFragment()
            findNavController().navigate(action)
        })

        binding.btnBindingDatapter.setOnClickListener(View.OnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToBindingAdapterFragment()
            findNavController().navigate(action)
        })

        binding.btnTestViewbinding.setOnClickListener(View.OnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTestViewBinding()
            findNavController().navigate(action)
        })

        binding.btnTestBinding2.setOnClickListener(View.OnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTestBinding2()
            findNavController().navigate(action)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}