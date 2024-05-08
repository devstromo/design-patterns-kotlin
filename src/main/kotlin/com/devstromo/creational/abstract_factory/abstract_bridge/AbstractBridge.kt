package com.devstromo.creational.abstract_factory.abstract_bridge

// Media Interfaces (Bridge Abstraction)
interface Media {
    fun play()
}

// Renderer Interfaces (Bridge Implementor)
interface Renderer {
    fun render()
}

// Concrete Renderers for Video
class OpenGLRenderer : Renderer {
    override fun render() {
        println("Rendering with OpenGL")
    }
}

class DirectXRenderer : Renderer {
    override fun render() {
        println("Rendering with DirectX")
    }
}

// Concrete Renderers for Audio
class MP3Renderer : Renderer {
    override fun render() {
        println("Rendering MP3")
    }
}

class AACRenderer : Renderer {
    override fun render() {
        println("Rendering AAC")
    }
}

// Concrete Media Types (Video and Audio)
class Video(val renderer: Renderer) : Media {
    override fun play() {
        println("Playing video")
        renderer.render()
    }
}

class Audio(val renderer: Renderer) : Media {
    override fun play() {
        println("Playing audio")
        renderer.render()
    }
}

// Abstract Factory Interface
interface MediaFactory {
    fun createVideo(): Media
    fun createAudio(): Media
}

// Concrete Factories
class HighPerformanceFactory : MediaFactory {
    override fun createVideo(): Media = Video(DirectXRenderer())
    override fun createAudio(): Media = Audio(AACRenderer())
}

class CompatibilityFactory : MediaFactory {
    override fun createVideo(): Media = Video(OpenGLRenderer())
    override fun createAudio(): Media = Audio(MP3Renderer())
}
