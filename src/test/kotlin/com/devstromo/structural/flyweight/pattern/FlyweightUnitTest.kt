package com.devstromo.structural.flyweight.pattern

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class FlyweightUnitTest {
    private lateinit var factory: ShapeFactory

    @BeforeEach
    fun setUp() {
        factory = ShapeFactory
    }

    @Test
    fun `Test same name and color returns same Shape object`() {
        val shape1 = factory.getShape("Circle", "Red")
        val shape2 = factory.getShape("Circle", "Red")

        assertSame(shape1, shape2)

    }

    @Test
    fun `Test different name or color returns different Shape objects`() {
        val shape1 = factory.getShape("Circle", "Red")
        val shape2 = factory.getShape("Circle", "Blue")
        val shape3 = factory.getShape("Square", "Red")

        assertNotSame(shape1, shape2)
        assertNotSame(shape1, shape3)

    }

    @Test
    fun `Test same name and color returns same Shape object but draw different coords`() {
        val shape1 = factory.getShape("Circle", "Red")
        val shape2 = factory.getShape("Circle", "Red")
        val circle1 = Circle(10, 8, shape1)
        val circle2 = Circle(13, 13, shape2)

        assertSame(shape1, shape2)
        assertNotSame(circle1, circle2)
        assertNotEquals(circle1.x, circle2.x)
        assertNotEquals(circle1.y, circle2.y)
    }

    @Test
    fun `Test Circle delegates draw call to Shape`() {
        val shapeMock = mock<Shape>()
        val circle = Circle(x = 10, y = 20, shape = shapeMock)

        circle.draw(10, 20)
        verify(shapeMock, times(1)).draw(10, 20)
    }
}