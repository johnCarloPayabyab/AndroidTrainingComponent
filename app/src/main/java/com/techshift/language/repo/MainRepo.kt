package com.techshift.language.repo

import android.util.Log
import com.google.gson.Gson
import com.techshift.language.model.EnglishPerson

class MainRepo constructor(
    private val gson: Gson,
    private val englishPerson: EnglishPerson
) {
    fun getData(){
        Log.e(">>>>>>","$gson ----- ")
    }

    fun getPerson(): String {
        return englishPerson.speakLanguage()
    }

}