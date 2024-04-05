package com.devstromo.behavioral.strategy.pattern

interface Strategy {
    fun execute(a: Int, b: Int): Int
}

// Step 2: Concrete strategy classes
class AddStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int = a + b
}

class SubtractStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int = a - b
}

class MultiplyStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int = a * b
}

// Step 3: Context class
class Context(private var strategy: Strategy) {
    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun executeStrategy(a: Int, b: Int): Int = strategy.execute(a, b)
}
