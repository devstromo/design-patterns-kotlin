package com.devstromo.behavioral.memento.pattern

// Originator class whose state needs to be saved and restored
class Originator(var state: String) {
    fun createMemento(): Memento = Memento(state)
    fun restore(memento: Memento) {
        state = memento.state
    }
}