package org.madmeetup.splash.viewmodel

import android.arch.lifecycle.ViewModel
import org.madmeetup.config.RemoteConfig

/**
 * Created by nikthakkar on 11/2/17.
 */
class SplashViewModel(private val remoteConfig: RemoteConfig): ViewModel() {

    fun getConfig() = remoteConfig.getConfig()
}