package com.devstromo.behavioral.state.base

fun main() {
    val initialState = InitialState()
    val context = Context(initialState)

    context.requestAction() // InitialState
    context.requestAction() // FinalState
    context.requestAction() // InitialState
    context.requestAction() // InitialState
}