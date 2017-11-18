package org.madmeetup.core.meetuplisting

import android.arch.lifecycle.LiveData

/**
 * Created by nikthakkar on 7/1/17.
 */
interface MeetupListingService {

    fun list(): LiveData<String>?
}