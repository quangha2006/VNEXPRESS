package com.quangha.vnexpress.ui.home

import android.view.LayoutInflater
import androidx.fragment.app.FragmentPagerAdapter
import com.quangha.vnexpress.base.BaseActivity
import com.quangha.vnexpress.databinding.ActivityMainBinding
import com.quangha.vnexpress.ui.home.adapters.MyPageAdapter


class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(MainViewModel::class) {

    override fun bindingView(inflater: LayoutInflater) = ActivityMainBinding.inflate(inflater)

    override fun initUIComponent() {
        setSupportActionBar(binding.toolbar)

        val fragmentAdapter =
            MyPageAdapter(
                supportFragmentManager,
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
                this
            )
        binding.viewPager.apply {
            offscreenPageLimit = 3
            adapter = fragmentAdapter
        }
        binding.tabLayout.setupWithViewPager(binding.viewPager)

    }

    override fun observerViewModel() {

    }

    companion object {
        var LogTag = "QUANGHA"
    }

}
