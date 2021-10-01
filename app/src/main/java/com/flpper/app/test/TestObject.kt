package com.flpper.app.test

import android.content.Context
import javax.inject.Inject

class TestObject @Inject constructor(
    private val context: Context
) : TestInterface {
}