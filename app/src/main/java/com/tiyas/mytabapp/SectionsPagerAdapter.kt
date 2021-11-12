package com.tiyas.mytabapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
//        return  2
        return 3
    }

    override fun createFragment(position: Int): HomeFragment {

//         menampilkan 2 fragmentyang berbedaa
//        var fragment : Fragment? =  null
//        when(position){
//            0 -> fragment = HomeFragment()
//            1 -> fragment = ProfileFragment()
//        }
//        return fragment as Fragment

//        menampilakn satu fragment yang saama dg jumlah 3
        return HomeFragment.newInstance(position +1)
    }
}