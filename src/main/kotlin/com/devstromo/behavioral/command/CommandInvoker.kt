package com.devstromo.behavioral.command

class CommandInvoker {
    private val commandHistory = mutableListOf<Command>()

    fun executeCommand(command: Command) {
        commandHistory.add(command)
        command.execute()
    }

    fun undoLastCommand() {
        if (commandHistory.isNotEmpty()) {
            val lastCommand = commandHistory.removeLast()
            lastCommand.undo()
        }
    }
}