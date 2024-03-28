package com.devstromo.behavioral.cor.logger

fun main() {
    val errorLogger = ErrorLogger(Logger.ERROR)
    val debugLogger = DebugLogger(Logger.DEBUG).setNextLogger(errorLogger)
    val infoLogger = InfoLogger(Logger.INFO).setNextLogger(debugLogger)

    infoLogger.logMessage(Logger.INFO, "This is an informational message.")
    infoLogger.logMessage(Logger.DEBUG, "This is a debug message.")
    infoLogger.logMessage(Logger.ERROR, "This is an error message.")
}