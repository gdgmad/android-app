package org.madmeetup.dagger

import dagger.Component
import org.madmeetup.core.dagger.CoreModule
import org.madmeetup.login.di.LoginComponent
import org.madmeetup.login.di.LoginModule
import org.madmeetup.splash.di.SplashComponent
import org.madmeetup.splash.di.SplashModule
import javax.inject.Singleton

/**
 * Created by nikthakkar on 1/10/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, CoreModule::class))
interface AppComponent {
    //Example usage
    fun plus(loginModule: LoginModule): LoginComponent

    fun plus(splashModule: SplashModule): SplashComponent
}
