package com.devstromo.behavioral.state.base

class Context(
    var state: State
) {
    fun requestAction() {
        state.doAction(this)
    }
}