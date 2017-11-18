package org.madmeetup.core.model

import org.madmeetup.core.exception.AppException

/**
 * Created by nikthakkar on 10/30/17.
 */
class Resource<T> private constructor(val status: Resource.Status, val data: T?, val exception: AppException?) {
    enum class Status {
        SUCCESS, ERROR, LOADING, CANCEL
    }
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }
        fun <T> error(exception: AppException? = null): Resource<T> {
            return Resource(Status.ERROR, null, exception)
        }
        fun <T> loading(data: T? = null): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
        fun <T> cancel(data: T? = null): Resource<T> {
            return Resource(Status.CANCEL, data, null)
        }
    }
}