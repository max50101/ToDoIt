package com.example.todoit

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel(){
    private val liveDate= MutableLiveData<Fragment>()
    val liveDateShared = liveDate
    init {
        Log.e("AAA","VM created")
    }

    override fun onCleared() {
        Log.e("AAA","VM stopped")
        super.onCleared()
    }
    fun registerNewFragment(fragment: Fragment){
        liveDate.value=fragment
    }
}