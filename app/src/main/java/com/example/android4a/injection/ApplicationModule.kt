package com.example.android4a.injection

import com.example.android4a.presentation.main.MainViewModel
import org.koin.dsl.module


val presentationModule = module (){
    factory { MainViewModel() }
}