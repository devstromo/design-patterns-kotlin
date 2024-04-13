package com.devstromo.creational.prototype.pattern

import org.junit.jupiter.api.Test
import kotlin.test.assertNotEquals

class PrototypeUnitTest {
    @Test
    fun `Tes Prototype Pattern`() {
        val originalSheep = Sheep("Jolly", "Mountain Sheep")
        val clonedSheep = originalSheep.clone() as Sheep
        clonedSheep.name = "Dolly"
        clonedSheep.category = "Plains Sheep"
        assertNotEquals(originalSheep, clonedSheep)
        assertNotEquals(originalSheep.name, clonedSheep.name)
        assertNotEquals(originalSheep.category, clonedSheep.category)
    }

    @Test
    fun `Tes Prototype Pattern with Book class`() {
        val originalBook = Book("The Kotlin Way", "Jane Doe", mutableListOf("Intro", "Usage", "Advanced"))

        val clonedBook = originalBook.clone() as Book
        clonedBook.pages.add("Appendix")

        assertNotEquals(originalBook, clonedBook)
        assertNotEquals(originalBook.pages.size, clonedBook.pages.size)
    }
}