package org.madmeetup.core.meetuplisting

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

/**
 * Created by nikthakkar on 7/1/17.
 */
class MeetupListingServiceImpl(private val database: FirebaseDatabase) : MeetupListingService {

    private val list: MutableLiveData<String> = MutableLiveData()
    private val node = "talks"

    override fun list(): LiveData<String> {

        database.getReference(node).addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError?) {
                list.value = null
            }

            override fun onDataChange(data: DataSnapshot?) {

                list.value = data?.value as String
            }
        })

        return list
    }
}

