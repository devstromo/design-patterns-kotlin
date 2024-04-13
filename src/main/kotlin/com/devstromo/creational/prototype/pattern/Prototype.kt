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