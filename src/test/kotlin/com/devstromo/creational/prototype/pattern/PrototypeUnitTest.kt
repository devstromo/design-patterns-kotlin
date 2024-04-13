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
}