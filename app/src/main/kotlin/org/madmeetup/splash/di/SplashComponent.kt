package org.madmeetup.splash.di

import dagger.Subcomponent
import org.madmeetup.dagger.scope.ActivityScope
import org.madmeetup.splash.ui.SplashActivity

/**
 * Created by nikthakkar on 11/2/17.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(SplashModule::class))
interface SplashComponent {

    fun inject(splashActivity: SplashActivity)
}