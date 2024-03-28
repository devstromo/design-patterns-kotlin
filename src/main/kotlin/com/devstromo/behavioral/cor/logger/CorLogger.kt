package com.devstromo.behavioral.cor.logger

abstract class Logger(private val level: Int) {
    companion object {
        const val INFO = 1
        const val DEBUG = 2
        const val ERROR = 3
    }

    // The next element in the chain of responsibility
    private var nextLogger: Logger? = null

    fun setNextLogger(nextLogger: Logger): Logger {
        this.nextLogger = nextLogger
        return this
    }

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message)
        }
        nextLogger?.logMessage(level, message)
    }

    protected abstract fun write(message: String)
}

// Concrete Loggers
class InfoLogger(level: Int) : Logger(level) {
    override fun write(message: String) {
        println("INFO Logger: $message")
    }
}

class DebugLogger(level: Int) : Logger(level) {
    override fun write(message: String) {
        println("DEBUG Logger: $message")
    }
}

class ErrorLogger(level: Int) : Logger(level) {
    override fun write(message: String) {
        println("ERROR Logger: $message")
    }
}
