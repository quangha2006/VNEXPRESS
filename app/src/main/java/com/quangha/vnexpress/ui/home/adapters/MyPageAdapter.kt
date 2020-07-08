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
            0 -> FragmentNews("/rss/tin-noi-bat.rss")
            1 -> FragmentNews("/rss/tin-moi-nhat.rss")
            2 -> FragmentNews("/rss/thoi-su.rss")
            3 -> FragmentNews("/rss/tam-su.rss")
            4 -> FragmentNews("/rss/the-gioi.rss")
            5 -> FragmentNews("/rss/kinh-doanh.rss")
            6 -> FragmentNews("/rss/giai-tri.rss")
            7 -> FragmentNews("/rss/the-thao.rss")
            8 -> FragmentNews("/rss/giao-duc.rss")
            9 -> FragmentNews("/rss/phap-luat.rss")
            else -> return FragmentNews("/rss/tin-moi-nhat.rss")
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
            8 -> context.getString(R.string.edu)
            9 -> context.getString(R.string.law)
            else -> return "unknown"
        }
    }
}