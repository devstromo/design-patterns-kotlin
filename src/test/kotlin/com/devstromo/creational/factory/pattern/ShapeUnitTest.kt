package com.devstromo.creational.factory.pattern

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class ShapeUnitTest {
    private val factory = ShapeFactory()

    @Test
    fun `test factory creates Circle`() {
        val shape = factory.getShape("CIRCLE")
        assertTrue(shape is Circle, "Factory should create a Circle when 'CIRCLE' is requested.")
    }

    @Test
    fun `test factory creates Rectangle`() {
        val shape = factory.getShape("RECTANGLE")
        assertTrue(shape is Rectangle, "Factory should create a Rectangle when 'RECTANGLE' is requested.")
    }

    @Test
    fun `test factory creates Square`() {
        val shape = factory.getShape("SQUARE")
        assertTrue(shape is Square, "Factory should create a Square when 'SQUARE' is requested.")
    }

    @Test
    fun `test factory returns null for unknown type`() {
        val shape = factory.getShape("TRIANGLE")
        assertNull(shape, "Factory should return null when an unknown type is requested.")
    }

    @Test
    fun `test draw method call`() {
        val mockCircle = mock<Circle>()
        mockCircle.draw()
        verify(mockCircle, times(1)).draw()
    }
}