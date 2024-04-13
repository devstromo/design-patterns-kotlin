package com.devstromo.creational.prototype.pattern

// Step 1: Prototype interface
interface Prototype {
    fun clone(): Prototype
}

// Step 2: Concrete class implementing Prototype
data class Sheep(var name: String, var category: String) : Prototype {
    override fun clone(): Prototype {
        return copy()
    }
}

// Step 2: Concrete class implementing Prototype
class Book(val title: String, val author: String, val pages: MutableList<String>) : Prototype {
    override fun clone(): Prototype {
        return Book(title, author, pages.toMutableList())  // Ensures a deep copy of the pages list
    }

    override fun toString() = "Book(title=\$title, author=\$author, pages=\$pages)"
}