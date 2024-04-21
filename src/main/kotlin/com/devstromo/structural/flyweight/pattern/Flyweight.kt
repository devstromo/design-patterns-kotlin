package com.devstromo.structural.flyweight.pattern

// Step 1: Flyweight interface
data class Shape(
    val name: String,
    val color: String,
) {
    fun draw(x: Int, y: Int) {
        println("Drawing Circle [Color: $color, name:$name  x: $x, y: $y]")
    }
}

// Step 2: Flyweight Factory
object ShapeFactory {
    private val shapes = mutableListOf<Shape>()
    fun getShape(
        name: String,
        color: String,
    ): Shape {
        val shape = shapes.find { shape -> shape.name == name && shape.color == color }
        return if (shape != null) {
            shape
        } else {
            val newShape = Shape(name, color)
            shapes.add(newShape)
            newShape
        }
    }
}

// Step 3: Concrete Flyweight class
data class Circle(
    val x: Int,
    val y: Int,
    private val shape: Shape,
) {
    fun draw(x: Int, y: Int) = shape.draw(x, y)
}
