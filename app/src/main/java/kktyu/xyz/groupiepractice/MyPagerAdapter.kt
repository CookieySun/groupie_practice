package kktyu.xyz.groupiepractice

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kktyu.xyz.groupiepractice.groupie.GroupieFragment
import kktyu.xyz.groupiepractice.rawRecyclerView.RawRecyclerViewFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> RawRecyclerViewFragment()
            else -> GroupieFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Raw RecyclerView"
            else -> "Groupie"
        }
    }
}