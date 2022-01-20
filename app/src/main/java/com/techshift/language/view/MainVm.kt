package com.techshift.language.view

import android.util.Log
import androidx.lifecycle.ViewModel
import com.techshift.language.module.AmericanPerson
import com.techshift.language.module.PersonModule
import com.techshift.language.module.SpanishPerson
import com.techshift.language.temp.Person
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainVm  @Inject constructor(
    @AmericanPerson private val englishPerson: Person,
    @SpanishPerson private val spanishPerson: Person,
    private val randomString: String
) : ViewModel(){

    fun getEnglishPerson(isAmerican: Boolean): String {
        Log.e(">>>>","$randomString")
        return if(isAmerican) englishPerson.getSpeakLanguage() else spanishPerson.getSpeakLanguage()
    }

}