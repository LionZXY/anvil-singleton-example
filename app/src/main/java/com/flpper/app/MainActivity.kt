package com.flpper.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flpper.app.di.DaggerMyComponent
import com.lionzxy.testdilibrary.test.TestInterface
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var testInterface: TestInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        DaggerMyComponent.factory().create(this).inject(this)
    }
}