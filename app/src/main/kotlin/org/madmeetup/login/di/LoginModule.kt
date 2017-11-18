package org.madmeetup.login.di

import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import dagger.Module
import dagger.Provides
import org.madmeetup.login.viewmodel.LoginViewModel

/**
 * Created by nikthakkar on 5/30/17.
 */

@Module
class LoginModule(private val activity: FragmentActivity) {

    @Provides
    fun providesUserViewModel(): LoginViewModel = ViewModelProviders.of(activity).get(LoginViewModel::class.java)

}