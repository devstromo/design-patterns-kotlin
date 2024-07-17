package com.devstromo.behavioral.iterator.pattern

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IteratorUnitTest {
    @Test
    fun `Test iterator over empty book collection`() {
        val bookCollection = BookCollection()
        val iterator = bookCollection.createIterator()

        assertTrue(!iterator.hasNext(), "Iterator should not have next element in empty collection")
    }

    @Test
    fun `Test iterator over non-empty book collection`() {
        val book1 = Book("Kotlin Programming", "Author A")
        val book2 = Book("Design Patterns", "Author B")
        val bookCollection = BookCollection()
        bookCollection.addBook(book1)
        bookCollection.addBook(book2)
        val iterator = bookCollection.createIterator()

        assertTrue(iterator.hasNext(), "Iterator should have next element")
        assertEquals(book1, iterator.next(), "First book should be 'Kotlin Programming'")
        assertTrue(iterator.hasNext(), "Iterator should have next element")
        assertEquals(book2, iterator.next(), "Second book should be 'Design Patterns'")
        assertTrue(!iterator.hasNext(), "Iterator should not have next element")
    }

    @Test
    fun `Test iterator traverses book collection correctly`() {
        val book1 = Book("Kotlin Programming", "Author A")
        val book2 = Book("Design Patterns", "Author B")
        val bookCollection = BookCollection()
        bookCollection.addBook(book1)
        bookCollection.addBook(book2)
        val iterator = bookCollection.createIterator()

        val titles = mutableListOf<String>()
        while (iterator.hasNext()) {
            val book = iterator.next()
            titles.add(book.title)
        }

        assertEquals(listOf("Kotlin Programming", "Design Patterns"), titles)
    }

    @Test
    fun `Test iterator over empty string collection`() {
        val stringCollection = StringCollection()
        val iterator = stringCollection.createIterator()

        assertTrue(!iterator.hasNext(), "Iterator should not have next element in empty collection")
    }

    @Test
    fun `Test iterator over non-empty string collection`() {
        val stringCollection = StringCollection()
        stringCollection.addString("Hello")
        stringCollection.addString("World")
        val iterator = stringCollection.createIterator()

        assertTrue(iterator.hasNext(), "Iterator should have next element")
        assertEquals("Hello", iterator.next(), "First string should be 'Hello'")
        assertTrue(iterator.hasNext(), "Iterator should have next element")
        assertEquals("World", iterator.next(), "Second string should be 'World'")
        assertTrue(!iterator.hasNext(), "Iterator should not have next element")
    }

    @Test
    fun `Test iterator traverses string collection correctly`() {
        val stringCollection = StringCollection()
        stringCollection.addString("Hello")
        stringCollection.addString("World")
        val iterator = stringCollection.createIterator()

        val strings = mutableListOf<String>()
        while (iterator.hasNext()) {
            strings.add(iterator.next())
        }

        assertEquals(listOf("Hello", "World"), strings)
    }
}