package com.techshift.language.module

import com.google.gson.Gson
import com.techshift.language.model.EnglishPerson
import com.techshift.language.repo.MainRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object MainRepository {

    @Provides
    fun provideMainRepository(gson: Gson,person: EnglishPerson):MainRepo {
        return MainRepo(gson,person)
    }
}