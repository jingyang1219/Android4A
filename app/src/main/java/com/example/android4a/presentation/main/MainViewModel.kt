package com.example.android4a.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android4a.domain.entity.User
import com.example.android4a.domain.usecase.CreateUserUseCase

class MainViewModel(
    val createUserUseCase: CreateUserUseCase
) :ViewModel(

){
    val counter: MutableLiveData<Int> = MutableLiveData()

    init{
        counter.value=0
    }
    fun onStart(){

    }

    fun onClickedIncrement(emailUser:String) {
        createUserUseCase.invoke(User(emailUser))
        counter.value = (counter.value ?:0)+1
    }
}