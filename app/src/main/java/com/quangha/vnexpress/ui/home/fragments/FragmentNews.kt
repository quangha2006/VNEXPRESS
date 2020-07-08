package com.quangha.vnexpress.ui.home.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater

import android.view.ViewGroup

import com.quangha.vnexpress.base.BaseFragment
import com.quangha.vnexpress.databinding.FragmentNewsBinding

class FragmentNews(url : String) : BaseFragment<FragmentNewsBinding>() {

    override fun bindingView(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentNewsBinding = FragmentNewsBinding.inflate(inflater, container, false)

    override fun initUIComponent() {

    }

    override fun observerViewModel() {

    }
}
