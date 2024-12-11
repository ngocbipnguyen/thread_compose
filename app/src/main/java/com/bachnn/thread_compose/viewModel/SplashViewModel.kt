package com.bachnn.thread_compose.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
@HiltViewModel
class SplashViewModel : ViewModel() {


    private var _splashState = MutableLiveData<Int>()
    val splashState: LiveData<Int> = _splashState

    init {
        viewModelScope.launch {
            delay(3000)
            val current = FirebaseAuth.getInstance().currentUser
             if (current != null) {
                 _splashState.postValue(1)
            } else {
                 _splashState.postValue(2)
            }
        }
    }


}