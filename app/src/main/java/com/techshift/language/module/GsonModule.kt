package com.techshift.language.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object GsonModule {

    @Provides
    fun provideGson(): Gson{
        return Gson()
    }


}