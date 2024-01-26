package com.devstromo.behavioral.command

interface Command {
    fun execute()
    fun undo()
}