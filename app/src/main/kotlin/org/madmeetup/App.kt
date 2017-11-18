package org.madmeetup

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import org.madmeetup.dagger.AppComponent
import org.madmeetup.dagger.AppModule
import org.madmeetup.dagger.DaggerAppComponent

/**
 * Created by nikthakkar on 5/30/17.
 */
class App : Application() {

    val appComponent: AppComponent by lazy { DaggerAppComponent.builder().appModule(AppModule(this)).build() }

    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)

    }
}