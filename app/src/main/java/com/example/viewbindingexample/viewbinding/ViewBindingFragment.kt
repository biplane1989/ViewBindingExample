package com.example.viewbindingexample.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingexample.databinding.FragmentViewBindingBinding

class ViewBindingFragment : Fragment() {

    private var _binding: FragmentViewBindingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentViewBindingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnHome.setOnClickListener(View.OnClickListener {
            setText()
        })
    }

    private fun setText() {
        binding.tvHome.text = "aloha"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}