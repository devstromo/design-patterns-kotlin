package com.devstromo.structural.bridge.pattern

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class BridgePatternUnitTest {

    @Test
    fun `Test draw with vector renderer`() {
        val renderer = mock<VectorRenderer>()
        val circle = Circle(renderer, 1.0)

        circle.draw()
        verify(renderer, times(1)).renderCircle(1.0)
    }

    @Test
    fun `Test draw with raster renderer`() {
        val renderer = mock<RasterRenderer>()
        val circle = Circle(renderer, 2.0)

        circle.draw()
        verify(renderer, times(1)).renderCircle(2.0)
    }

    @Test
    fun `Test resize and draw`() {
        val renderer = mock<VectorRenderer>()
        val circle = Circle(renderer, 1.0)

        circle.resize(2.0)
        circle.draw()

        assertEquals(2.0, circle.radius, 0.01)

        verify(renderer, times(1)).renderCircle(2.0)
    }
}