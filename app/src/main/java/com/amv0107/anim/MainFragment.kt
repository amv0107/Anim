package com.amv0107.anim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.amv0107.anim.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            btnAlpha.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.alpha)
            }
            btnScale.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.scale)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}