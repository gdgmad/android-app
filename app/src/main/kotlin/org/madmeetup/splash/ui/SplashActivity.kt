package org.madmeetup.splash.ui

import android.os.Bundle
import org.madmeetup.R
import org.madmeetup.base.DaggerActivity
import org.madmeetup.dagger.AppComponent
import org.madmeetup.splash.di.SplashModule
import org.madmeetup.splash.viewmodel.SplashViewModel
import javax.inject.Inject

/**
 * Created by nikthakkar on 11/2/17.
 */
class SplashActivity : DaggerActivity() {

    @Inject
    lateinit var viewModel: SplashViewModel

    override fun layoutId() = R.layout.activity_splash

    override fun inject(appComponent: AppComponent) {
        appComponent.plus(SplashModule(this)).inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}