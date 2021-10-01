package com.flpper.app.di

import com.flpper.app.test.TestInterface
import com.flpper.app.test.TestObject
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class MyComponentModule {

    @Binds
    @Singleton
    abstract fun provideTestInterface(testObject: TestObject): TestInterface
}