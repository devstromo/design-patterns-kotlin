package com.devstromo.structural.proxy.pattern

// Database Interface (Subject)
interface Database {
    fun fetchData(query: String): String
}

// Real Database (Real Subject)
class RealDatabase : Database {
    override fun fetchData(query: String): String {
        // Simulate a database fetch
        println("Fetching data from the database for query: $query")
        return "Data for $query"
    }
}

// Database Proxy
class DatabaseProxy(private val realDatabase: RealDatabase) : Database {
    private val cache = mutableMapOf<String, String>()

    override fun fetchData(query: String): String {
        return cache.getOrPut(query) {
            println("Cache miss for query: $query. Fetching from database.")
            realDatabase.fetchData(query)
        }
    }
}
