package com.devstromo.behavioral.command

class WriteCommand(private val editor: TextEditor, private val text: String) : Command {
    override fun execute() {
        editor.addText(text)
    }

    override fun undo() {
        val lengthToRemove = text.length
        editor.removeText(lengthToRemove)
    }
}