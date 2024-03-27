package com.devstromo.behavioral.cor.handler

fun main() {
    val handlerA = ConcreteHandlerA()
    val handlerB = ConcreteHandlerB()

    handlerA.setNext(handlerB)

    arrayOf("A", "B", "C").forEach { request ->
        handlerA.handle(request)
    }
}