package com.techshift.language.temp

import javax.inject.Inject


class EnglishPersonImpl @Inject constructor(): Person {
    override fun getSpeakLanguage(): String {
        return "Im american"
    }
}