package com.devstromo.structural.decorator.composition

import com.devstromo.structural.decorator.PineChristmasTree
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorUsingCompositionUnitTest {
    @Test
    fun `Test Decorator Pattern using composition`() {
        val christmasTree = BubbleLights(PineChristmasTree())
        val decoratedChristmasTree = christmasTree.decorate()
        val expected = "Christmas tree with Bubble Lights"
        assertEquals(expected, decoratedChristmasTree)
    }
}