package com.devstromo.behavioral.state.base


class InitialState : State {
    override fun doAction(context: Context) {
        println("InitialState: Action on InitialState performed")
        context.state = FinalState()
    }
}

class FinalState : State {
    override fun doAction(context: Context) {
        println("FinalState: Action on FinalState performed")
        context.state = InitialState()
    }
}