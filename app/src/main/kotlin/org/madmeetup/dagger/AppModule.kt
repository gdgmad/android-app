package org.madmeetup.dagger

import android.app.Application
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import dagger.Module
import dagger.Provides
import org.madmeetup.config.RemoteConfig
import javax.inject.Singleton

/**
 * Created by nikthakkar on 1/13/17.
 */

@Module
class AppModule(private val app: Application) {

    @Provides
    @Singleton
    fun providesAppContext() = app

    @Provides
    @Singleton
    fun providesRemoteConfig() = RemoteConfig(FirebaseRemoteConfig.getInstance())
}
