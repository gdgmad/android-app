package org.madmeetup.login.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import com.facebook.FacebookSdk
import org.madmeetup.R
import org.madmeetup.base.DaggerActivity
import org.madmeetup.config.RemoteConfig
import org.madmeetup.core.model.Resource
import org.madmeetup.dagger.AppComponent
import org.madmeetup.extensions.log
import org.madmeetup.login.di.LoginModule
import javax.inject.Inject

class LoginActivity : DaggerActivity() {

    @Inject
    lateinit var remoteConfig: RemoteConfig

    override fun layoutId() = R.layout.activity_login

    override fun inject(appComponent: AppComponent) = appComponent.plus(LoginModule(this)).inject(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        remoteConfig.getConfig().observe(this, Observer<Resource<RemoteConfig>> {

            when (it?.status) {
                Resource.Status.LOADING -> {
                    log("In Loading")
                }

                Resource.Status.ERROR -> {
                    log("In Error")
                }

                Resource.Status.SUCCESS -> {
                    log("In Success")
                    FacebookSdk.setApplicationId(remoteConfig.facebookAPIKey)
                    FacebookSdk.setApplicationName("")
                }

                Resource.Status.CANCEL -> {
                    log("In Cancel")
                }
            }
        })
    }
}
