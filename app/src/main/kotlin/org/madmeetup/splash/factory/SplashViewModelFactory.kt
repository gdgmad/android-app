package org.madmeetup.splash.factory

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import org.madmeetup.config.RemoteConfig
import org.madmeetup.splash.viewmodel.SplashViewModel


/**
 * Created by nikthakkar on 11/2/17.
 */

class SplashViewModelFactory(private val remoteConfig: RemoteConfig): ViewModelProvider.Factory {


    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SplashViewModel::class.java)) {
            return SplashViewModel(remoteConfig) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}