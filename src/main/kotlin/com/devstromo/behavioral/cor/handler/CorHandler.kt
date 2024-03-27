package com.devstromo.behavioral.cor.handler

// Step 1: Handler interface
interface Handler {
    fun setNext(handler: Handler): Handler
    fun handle(request: String)
}

// Step 2: Concrete handler classes
class ConcreteHandlerA : Handler {
    private var nextHandler: Handler? = null

    override fun setNext(handler: Handler): Handler {
        nextHandler = handler
        return handler
    }

    override fun handle(request: String) {
        if (request == "A") {
            println("ConcreteHandlerA handled request: $request")
        } else {
            nextHandler?.handle(request)
        }
    }
}

class ConcreteHandlerB : Handler {
    private var nextHandler: Handler? = null

    override fun setNext(handler: Handler): Handler {
        nextHandler = handler
        return handler
    }

    override fun handle(request: String) {
        if (request == "B") {
            println("ConcreteHandlerB handled request: $request")
        } else {
            nextHandler?.handle(request)
        }
    }
}