package org.madmeetup.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding

/**
 * Created by nikthakkar on 5/25/17.
 */
abstract class DataBindingActivity<VB : ViewDataBinding> : DaggerActivity() {

    lateinit var vb: VB

    override fun setContentView(layoutResID: Int) {
        vb = DataBindingUtil.inflate(layoutInflater, layoutResID, null, false)
        super.setContentView(vb.root)
    }
}