package com.example.cofrethcmms.ui.main

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.cofrethcmms.Closed
import com.example.cofrethcmms.InProgress
import com.example.cofrethcmms.Open


private val TAB_TITLES = arrayOf(
    com.example.cofrethcmms.R.string.tab_text_1,
    com.example.cofrethcmms.R.string.tab_text_2,
    com.example.cofrethcmms.R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        when (position) {
            0 -> return Open() //ChildFragment1 at position 0
            1 -> return InProgress() //ChildFragment2 at position 1
            2 -> return Closed() //ChildFragment3 at position 2
        }
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 3 total pages.
        return 3
    }
}