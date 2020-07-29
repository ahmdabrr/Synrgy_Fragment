package com.example.synrgy_fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterPager (fm: FragmentManager) : FragmentPagerAdapter (fm){
    //sebuah list yang menampung objek Fragment
    private val pages = listOf(
        FragmentA(),
        FragmentB(),
        FragmentC()
    )

    //menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem (position: Int) : Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    //judul untuk tabs
    override fun getPageTitle (position: Int) : CharSequence? {
        return when(position) {
            0 -> "Fragment A"
            1 -> "Fragment B"
            else -> "Fragment C"
        }
    }
}