package com.devstromo.behavioral.command

class DeleteCommand(private val editor: TextEditor) : Command {
    private var lastDeleted: String = ""

    override fun execute() {
        lastDeleted = editor.deleteLast()
    }

    override fun undo() {
        editor.addText(lastDeleted)
    }
}

