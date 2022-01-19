package com.techshift.language.model

import com.techshift.language.repo.Person
import javax.inject.Inject

class SpanishPerson @Inject constructor(): Person{

    override fun speakLanguage(): String {
        return "Hola senyorita"
    }
}