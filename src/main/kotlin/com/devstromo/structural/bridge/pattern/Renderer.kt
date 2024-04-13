package com.devstromo.structural.bridge.pattern

interface Renderer {
    fun renderCircle(radius: Double)
}

// Step 4: Concrete Implementor classes
class VectorRenderer : Renderer {
    override fun renderCircle(radius: Double) {
        println("Drawing a circle of radius \$radius with Vector rendering")
    }
}

class RasterRenderer : Renderer {
    override fun renderCircle(radius: Double) {
        println("Drawing pixels for a circle of radius \$radius with Raster rendering")
    }
}

// Step 1 and 2: Abstraction and refined abstraction
abstract class Shape(protected val renderer: Renderer) {
    abstract fun draw()
    abstract fun resize(factor: Double)
}

class Circle(renderer: Renderer, var radius: Double) : Shape(renderer) {
    override fun draw() {
        renderer.renderCircle(radius)
    }

    override fun resize(factor: Double) {
        radius *= factor
    }
}
