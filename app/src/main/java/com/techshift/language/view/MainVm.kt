package com.techshift.language.view

import androidx.lifecycle.ViewModel
import com.techshift.language.repo.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainVm @Inject constructor(
    private val mainRepo: MainRepo
) : ViewModel(){

    fun getDataVM(){
        mainRepo.getData()
    }

    fun getEnglishPerson(): String {
        return mainRepo.getPerson()
    }

}