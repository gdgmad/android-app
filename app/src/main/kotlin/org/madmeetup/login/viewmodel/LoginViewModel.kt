package org.madmeetup.login.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

/**
 * Created by nikthakkar on 6/26/17.
 */

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private var data = MutableLiveData<String>()

    fun getData() : LiveData<String> {
        data.value = "Some Data"
        return data
    }
}