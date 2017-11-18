package org.madmeetup.core.dagger

import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import org.madmeetup.core.meetuplisting.MeetupListingService
import org.madmeetup.core.meetuplisting.MeetupListingServiceImpl
import javax.inject.Singleton

/**
 * Created by nikthakkar on 7/1/17.
 */

@Module
class CoreModule {

    @Provides @Singleton
    fun providesListingService(): MeetupListingService = MeetupListingServiceImpl(FirebaseDatabase.getInstance())
}