package com.tiyas.mytabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    companion object{
        private  val TAB_TITLES = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3,
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        menghubungkan tab layout dg viewPager menggunakan adapter

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager : ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs : TabLayout = findViewById(R.id.tabs)

//        menghubungkan dengan tab layout mediator
        TabLayoutMediator(tabs, viewPager){
            tabs,position -> tabs.text = resources.getString(TAB_TITLES[position])

        }.attach()

        supportActionBar?.elevation = 0f

    }
}