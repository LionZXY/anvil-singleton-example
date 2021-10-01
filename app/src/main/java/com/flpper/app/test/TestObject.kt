package com.flpper.app.test

import android.content.Context
import com.flpper.app.di.TestGraph
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@ContributesBinding(TestGraph::class)
class TestObject @Inject constructor(
    private val context: Context
) : TestInterface {
}