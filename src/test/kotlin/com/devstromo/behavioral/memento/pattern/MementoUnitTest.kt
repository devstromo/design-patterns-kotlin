package com.devstromo.behavioral.memento.pattern

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MementoUnitTest {
    @Test
    fun `Test Memento`() {
        val originator = Originator("Initial State")
        val caretaker = Caretaker()

        caretaker.saveState(originator)
        originator.state = "New State"
        println("Current State: ${originator.state}") // New State
        assertEquals("New State", originator.state)

        caretaker.restoreState(originator, 0)
        println("Restored State: ${originator.state}") // Initial State
        assertEquals("Initial State", originator.state)
    }

}