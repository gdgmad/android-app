package org.madmeetup.splash.di

import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import dagger.Module
import dagger.Provides
import org.madmeetup.config.RemoteConfig
import org.madmeetup.splash.factory.SplashViewModelFactory
import org.madmeetup.splash.viewmodel.SplashViewModel

/**
 * Created by nikthakkar on 11/2/17.
 */
@Module
class SplashModule(private val activity: FragmentActivity) {

    @Provides
    fun providesSplashViewModel(splashViewModelFactory: SplashViewModelFactory): SplashViewModel = ViewModelProviders.of(activity,splashViewModelFactory).get(SplashViewModel::class.java)

    @Provides
    fun providesSplashViewModelFactory(remoteConfig: RemoteConfig) = SplashViewModelFactory(remoteConfig)
}