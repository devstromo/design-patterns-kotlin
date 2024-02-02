package com.devstromo.behavioral.memento.pattern

// Caretaker class that keeps track of multiple mementos
class Caretaker {
    private val mementos = mutableListOf<Memento>()

    fun saveState(originator: Originator) {
        mementos.add(originator.createMemento())
    }

    fun restoreState(originator: Originator, index: Int) {
        if (index < mementos.size) {
            originator.restore(mementos[index])
        }
    }
}