package com.devstromo.structural.decorator.delegation

import com.devstromo.structural.decorator.PineChristmasTree
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecoratorUsingDelegationUnitTest {
    @Test
    fun `Test Decorator Pattern using delegation`() {
        val christmasTree = Garlands(PineChristmasTree())
        val decoratedChristmasTree = christmasTree.decorate()
        val expected = "Christmas tree with Garlands"
        assertEquals(expected, decoratedChristmasTree)
    }
}