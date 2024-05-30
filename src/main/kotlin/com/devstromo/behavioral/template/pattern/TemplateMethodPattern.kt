package com.devstromo.behavioral.template.pattern

// Template Method Pattern Example in Kotlin

// Abstract Class defining the template method
abstract class DataProcessor {
    // Template method
    fun process() {
        readData()
        processData()
        writeData()
    }

    abstract fun readData()
    abstract fun processData()
    abstract fun writeData()
}

// Concrete class implementing the steps
class CSVDataProcessor : DataProcessor() {
    override fun readData() {
        println("Reading data from CSV file")
    }

    override fun processData() {
        println("Processing CSV data")
    }

    override fun writeData() {
        println("Writing data to CSV file")
    }
}

// Another Concrete class implementing the steps
class JSONDataProcessor : DataProcessor() {
    override fun readData() {
        println("Reading data from JSON file")
    }

    override fun processData() {
        println("Processing JSON data")
    }

    override fun writeData() {
        println("Writing data to JSON file")
    }
}

