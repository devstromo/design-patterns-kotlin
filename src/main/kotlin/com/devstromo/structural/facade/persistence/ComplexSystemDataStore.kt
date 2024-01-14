package com.devstromo.structural.facade.persistence

class ComplexSystemDataStore(private val filePath: String) {
    private val cache: HashMap<String, String>

    init {
        println("The data is read from the file: $filePath")
        cache = HashMap()
    }

    fun store(key: String, value: String) {
        cache[key] = value
    }

    fun read(key: String) = cache[key] ?: ""

    fun commit() = println("Storing cached data to file $filePath")
}

data class User(val login: String)