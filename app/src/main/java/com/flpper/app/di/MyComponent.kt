package com.flpper.app.di

import android.content.Context
import com.flpper.app.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MyComponentModule::class])
interface MyComponent {
    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): MyComponent
    }
}