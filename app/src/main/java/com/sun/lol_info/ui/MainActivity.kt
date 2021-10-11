package com.sun.lol_info.ui

import android.content.Context
import android.content.Intent
import com.sun.lol_info.base.BaseActivity
import com.sun.lol_info.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val viewBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initComponents() {
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}
