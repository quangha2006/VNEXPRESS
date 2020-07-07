package com.quangha.vnexpress.ui.home.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.quangha.vnexpress.R
import com.quangha.vnexpress.ui.home.fragments.FragmentNews

class MyPageAdapter(fm: FragmentManager, behavior: Int, private val context: Context) :
    FragmentPagerAdapter(fm, behavior) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentNews()
            1 -> FragmentNews()
            2 -> FragmentNews()
            3 -> FragmentNews()
            4 -> FragmentNews()
            5 -> FragmentNews()
            6 -> FragmentNews()
            7 -> FragmentNews()
            8 -> FragmentNews()
            9 -> FragmentNews()
            else -> return FragmentNews()
        }

    }

    override fun getCount(): Int {
        return 10
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.getString(R.string.news)
            1 -> context.getString(R.string.news1)
            2 -> context.getString(R.string.news2)
            3 -> context.getString(R.string.windows)
            4 -> context.getString(R.string.world)
            5 -> context.getString(R.string.business)
            6 -> context.getString(R.string.relax)
            7 -> context.getString(R.string.sport)
            8 -> context.getString(R.string.law)
            9 -> context.getString(R.string.law)
            else -> return "unknown"
        }
    }
}