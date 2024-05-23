package com.devstromo.structural.composite

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class CompositePatternUnitTest {

    @Test
    fun `Test drawing a single dot`() {
        val dot = Dot(1, 2)
        val output = captureOutput { dot.draw() }
        assertTrue(output.contains("Drawing Dot at (1, 2)"))
    }

    @Test
    fun `Test composite graphic with multiple dots`() {
        val dot1 = mock<Dot>()
        val dot2 = mock<Dot>()
        val composite = CompositeGraphic()
        composite.add(dot1)
        composite.add(dot2)

        composite.draw()
        verify(dot1, times(1)).draw()
        verify(dot2, times(1)).draw()
    }

    @Test
    fun `Test nested composite graphics`() {
        val dot1 = mock<Dot>()
        val dot2 = mock<Dot>()
        val composite1 = CompositeGraphic()
        composite1.add(dot1)

        val composite2 = CompositeGraphic()
        composite2.add(composite1)
        composite2.add(dot2)

        composite2.draw()
        verify(dot1, times(1)).draw()
        verify(dot2, times(1)).draw()
    }
}

fun captureOutput(block: () -> Unit): String {
    val outputStream = java.io.ByteArrayOutputStream()
    val printStream = java.io.PrintStream(outputStream)
    val oldOut = System.out
    try {
        System.setOut(printStream)
        block()
    } finally {
        System.setOut(oldOut)
    }
    return outputStream.toString()
}