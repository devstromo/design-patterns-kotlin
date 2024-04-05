package com.devstromo.behavioral.strategy.pattern

fun main() {
    val context = Context(AddStrategy())
    println("10 + 5 = ${context.executeStrategy(10, 5)}")

    context.setStrategy(SubtractStrategy())
    println("10 - 5 = ${context.executeStrategy(10, 5)}")

    context.setStrategy(MultiplyStrategy())
    println("10 * 5 = ${context.executeStrategy(10, 5)}")
}