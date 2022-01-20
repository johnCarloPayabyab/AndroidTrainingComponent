package com.techshift.language

import com.techshift.language.model.EnglishPerson
import dagger.hilt.android.testing.HiltAndroidRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import org.junit.Assert.*

class MainVm {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var person : EnglishPerson

    @Before
    fun setup(){
        hiltRule.inject()
    }

    @Test
    fun isHelloPeter(){
        assertEquals("Hello Peter",person.speakLanguage())
    }
}