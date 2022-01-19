package com.techshift.language.module

import com.techshift.language.model.EnglishPerson
import com.techshift.language.repo.Person
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class PersonModule {

    @Binds
    abstract fun EnglishPersonImpl(englishPerson: EnglishPerson): Person
}