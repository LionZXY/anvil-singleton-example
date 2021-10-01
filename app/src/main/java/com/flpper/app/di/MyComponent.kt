package com.flpper.app.di

import android.content.Context
import com.flpper.app.MainActivity
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@MergeComponent(TestGraph::class)
interface MyComponent {
    fun inject(activity: MainActivity)
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): MyComponent
    }
}