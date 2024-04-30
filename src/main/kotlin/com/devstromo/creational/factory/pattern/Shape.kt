package com.devstromo.creational.factory.pattern


// Step 1: Shape interface
interface Shape {
    fun draw()
}

// Step 2: Concrete classes implementing Shape
class Circle : Shape {
    override fun draw() {
        println("Inside Circle::draw() method.")
    }
}

class Rectangle : Shape {
    override fun draw() {
        println("Inside Rectangle::draw() method.")
    }
}

class Square : Shape {
    override fun draw() {
        println("Inside Square::draw() method.")
    }
}

// Step 3: ShapeFactory class
class ShapeFactory {
    fun getShape(shapeType: String): Shape? {
        return when (shapeType) {
            "CIRCLE" -> Circle()
            "RECTANGLE" -> Rectangle()
            "SQUARE" -> Square()
            else -> null
        }
    }
}