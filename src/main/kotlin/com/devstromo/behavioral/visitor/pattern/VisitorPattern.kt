package com.devstromo.behavioral.visitor.pattern

// Element Interface
interface Element {
    fun accept(visitor: Visitor)
}

// Concrete Elements
class Book(val title: String, val price: Double) : Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}

class Fruit(val name: String, val weight: Double, val pricePerKg: Double) : Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}

// Visitor Interface
interface Visitor {
    fun visit(book: Book)
    fun visit(fruit: Fruit)
}

// Concrete Visitor
class ShoppingCartVisitor : Visitor {
    private var totalCost = 0.0

    override fun visit(book: Book) {
        totalCost += book.price
        println("Book: ${book.title}, Price: ${book.price}")
    }

    override fun visit(fruit: Fruit) {
        val cost = fruit.weight * fruit.pricePerKg
        totalCost += cost
        println("Fruit: ${fruit.name}, Cost: $cost")
    }

    fun getTotalCost(): Double {
        return totalCost
    }
}