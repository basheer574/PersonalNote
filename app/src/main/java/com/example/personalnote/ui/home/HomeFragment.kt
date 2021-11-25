package com.example.personalnote.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.personalnote.R
import com.example.personalnote.databinding.FragmentHomeBinding
import com.example.personalnote.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override val viewModel by activityViewModels<HomeViewModel>()

    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentHomeBinding
        = DataBindingUtil::inflate

    override fun setupView() {
        binding.let {
            it.viewModel = viewModel
        }
    }
}