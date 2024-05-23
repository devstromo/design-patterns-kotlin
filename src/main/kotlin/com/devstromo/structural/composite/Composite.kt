package com.devstromo.structural.composite

// Graphic Interface (Component)
interface Graphic {
    fun draw()
}

// Dot Class (Leaf)
class Dot(private val x: Int, private val y: Int) : Graphic {
    override fun draw() {
        println("Drawing Dot at ($x, $y)")
    }
}

// CompositeGraphic Class (Composite)
class CompositeGraphic : Graphic {
    private val children = mutableListOf<Graphic>()

    fun add(graphic: Graphic) {
        children.add(graphic)
    }

    fun remove(graphic: Graphic) {
        children.remove(graphic)
    }

    override fun draw() {
        for (child in children) {
            child.draw()
        }
    }
}

// Usage
fun main() {
    val dot1 = Dot(1, 2)
    val dot2 = Dot(3, 4)

    val composite1 = CompositeGraphic()
    composite1.add(dot1)
    composite1.add(dot2)

    val composite2 = CompositeGraphic()
    composite2.add(composite1)
    composite2.add(Dot(5, 6))

    composite2.draw() // This will draw all the dots in the structure
}
