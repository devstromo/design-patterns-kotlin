package com.devstromo.creational.abstract_factory.pattern

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AbstractFactoryUnitTest {
    @Test
    fun `test Material Factory creates Material components`() {
        val factory: GUIFactory = MaterialFactory()
        assertTrue(factory.createButton() is MaterialButton)
        assertTrue(factory.createCheckbox() is MaterialCheckbox)
    }

    @Test
    fun `test Fluent Factory creates Fluent components`() {
        val factory: GUIFactory = FluentFactory()
        assertTrue(factory.createButton() is FluentButton)
        assertTrue(factory.createCheckbox() is FluentCheckbox)
    }
}