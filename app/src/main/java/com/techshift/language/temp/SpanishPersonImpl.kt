package com.techshift.language.temp

import javax.inject.Inject

class SpanishPersonImpl @Inject constructor(): Person {
    override fun getSpeakLanguage(): String {
         return "Hola Peter"
    }
}