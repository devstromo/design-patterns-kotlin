package com.devstromo.creational.abstract_factory.abstract_bridge

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AbstractBridgeUnitTest {

    @Test
    fun `test High Performance Factory creates correct implementations`() {
        val factory: MediaFactory = HighPerformanceFactory()
        assertTrue((factory.createVideo() as Video).renderer is DirectXRenderer)
        assertTrue((factory.createAudio() as Audio).renderer is AACRenderer)
    }

    @Test
    fun `test Compatibility Factory creates correct implementations`() {
        val factory: MediaFactory = CompatibilityFactory()
        assertTrue((factory.createVideo() as Video).renderer is OpenGLRenderer)
        assertTrue((factory.createAudio() as Audio).renderer is MP3Renderer)
    }
}