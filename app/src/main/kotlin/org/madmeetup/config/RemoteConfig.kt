package org.madmeetup.config

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import org.madmeetup.BuildConfig
import org.madmeetup.core.exception.AppException
import org.madmeetup.core.model.Resource
import java.lang.Exception

/**
 * Created by nikthakkar on 11/1/17.
 */
class RemoteConfig(private val remoteConfig: FirebaseRemoteConfig) {

    private val config: MutableLiveData<Resource<RemoteConfig>>

    val twitterAPIKey: String
        get() = remoteConfig.getString("api_twitter_key")

    val twitterAPISecret: String
        get() = remoteConfig.getString("api_twitter_secret")

    val facebookAPIKey: String
        get() = remoteConfig.getString("api_facebook_key")

    init {
        val configSettings = FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build()
        remoteConfig.setConfigSettings(configSettings)
        config = MutableLiveData()
    }

    fun getConfig(): LiveData<Resource<RemoteConfig>> {
        if (config.value == null || config.value?.status == Resource.Status.ERROR) {
            config.value = Resource.loading()
            remoteConfig.fetch().addOnSuccessListener {
                remoteConfig.activateFetched()
                config.value = Resource.success(this)
            }.addOnFailureListener {
                config.value = Resource.error(AppException(Exception("RemoteConfig fetch failed")))
            }
        }
        return config
    }
}