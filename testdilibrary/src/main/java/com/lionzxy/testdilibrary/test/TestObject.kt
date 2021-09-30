package com.lionzxy.testdilibrary.test

import android.content.Context
import com.lionzxy.commonlibrary.TestGraph
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@ContributesBinding(TestGraph::class)
class TestObject @Inject constructor(
    private val context: Context
) : TestInterface {
}