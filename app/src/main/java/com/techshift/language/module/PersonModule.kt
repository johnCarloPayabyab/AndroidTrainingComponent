package com.techshift.language.module

import com.techshift.language.temp.EnglishPersonImpl
import com.techshift.language.temp.Person
import com.techshift.language.temp.SpanishPersonImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Qualifier

@Module
@InstallIn(ViewModelComponent::class)
class PersonModule {

    @AmericanPerson
    @Provides
    fun provideAmericanPerson(): Person {
        return EnglishPersonImpl()
    }

    @SpanishPerson
    @Provides
    fun provideSpanishPerson(): Person {
        return SpanishPersonImpl()
    }

    @Provides
    fun provideRandomString(): String {
        return  "hello im here"
    }

//    @Binds
//    abstract fun bindSpanishPerson(person: SpanishPersonImpl): Person

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AmericanPerson

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SpanishPerson
