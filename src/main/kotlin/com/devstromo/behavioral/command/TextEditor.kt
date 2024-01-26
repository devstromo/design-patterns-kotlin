package com.devstromo.behavioral.command

class TextEditor {
    private val text = StringBuilder()

    fun addText(newText: String) {
        text.append(newText)
    }

    fun removeText(length: Int) {
        if (text.length >= length) {
            text.delete(text.length - length, text.length)
        }
    }

    fun deleteLast(): String {
        if (text.isNotEmpty()) {
            val lastChar = text.last().toString()
            text.deleteCharAt(text.lastIndex)
            return lastChar
        }
        return ""
    }

    fun getContent() = text.toString()
}