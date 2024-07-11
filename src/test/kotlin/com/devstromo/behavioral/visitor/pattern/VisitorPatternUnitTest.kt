package com.devstromo.behavioral.visitor.pattern

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class VisitorPatternUnitTest {
    @Test
    fun `Test book visit`() {
        val book = Book("Kotlin Programming", 30.0)
        val visitor = spy(ShoppingCartVisitor())

        book.accept(visitor)
        verify(visitor, times(1)).visit(book)
        assertEquals(30.0, visitor.getTotalCost())
    }

    @Test
    fun `Test fruit visit`() {
        val fruit = Fruit("Apple", 1.5, 2.0)
        val visitor = spy(ShoppingCartVisitor())

        fruit.accept(visitor)
        verify(visitor, times(1)).visit(fruit)
        assertEquals(3.0, visitor.getTotalCost())
    }

    @Test
    fun `Test multiple items visit`() {
        val items: List<Element> = listOf(
            Book("Kotlin Programming", 30.0),
            Fruit("Apple", 1.5, 2.0),
            Fruit("Banana", 2.0, 1.5)
        )
        val visitor = spy(ShoppingCartVisitor())

        items.forEach { it.accept(visitor) }

        verify(visitor, times(1)).visit(items[0] as Book)
        verify(visitor, times(1)).visit(items[1] as Fruit)
        verify(visitor, times(1)).visit(items[2] as Fruit)

        assertEquals(36.0, visitor.getTotalCost())
    }
}