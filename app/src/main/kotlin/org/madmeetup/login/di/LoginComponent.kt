package org.madmeetup.login.di

import dagger.Subcomponent
import org.madmeetup.dagger.scope.ActivityScope
import org.madmeetup.login.ui.LoginActivity

/**
 * Created by nikthakkar on 5/30/17.
 */

@ActivityScope
@Subcomponent(modules = arrayOf(LoginModule::class))
interface LoginComponent {

    fun inject(loginActivity: LoginActivity)
}
