package com.techshift.language.model

import com.techshift.language.repo.Person
import javax.inject.Inject

class EnglishPerson @Inject constructor(): Person {
    override fun speakLanguage(): String {
       return "Hello peter"
    }
}