package org.madmeetup.base

import android.os.Bundle
import org.madmeetup.App
import org.madmeetup.dagger.AppComponent

/**
 * Created by nikthakkar on 5/30/17.
 */
abstract class DaggerActivity : BaseActivity() {

    private lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent = (applicationContext as App).appComponent
        inject(appComponent)
    }

    abstract fun inject(appComponent: AppComponent)
}