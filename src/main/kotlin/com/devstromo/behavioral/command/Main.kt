package com.devstromo.behavioral.command

fun main() {
    val editor = TextEditor()
    val invoker = CommandInvoker()

    invoker.executeCommand(WriteCommand(editor, "Hello, "))
    invoker.executeCommand(WriteCommand(editor, "world!"))
    println("Current text: ${editor.getContent()}")

    invoker.undoLastCommand()
    println("After undo: ${editor.getContent()}")

    invoker.executeCommand(WriteCommand(editor, "second command!"))
    println("Current text: ${editor.getContent()}")

    invoker.executeCommand(DeleteCommand(editor))
    println("After delete: ${editor.getContent()}")

    invoker.undoLastCommand()
    println("After undo: ${editor.getContent()}")
}