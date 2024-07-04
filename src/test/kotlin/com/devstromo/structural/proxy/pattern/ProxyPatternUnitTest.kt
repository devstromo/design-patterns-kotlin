package com.devstromo.structural.proxy.pattern

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class ProxyPatternUnitTest {
    @Test
    fun `Test fetch data with cache miss`() {
        val realDatabase = mock(RealDatabase::class.java)
        val databaseProxy = DatabaseProxy(realDatabase)

        val query = "SELECT * FROM users"
        `when`(realDatabase.fetchData(query)).thenReturn("Data for $query")

        val result = databaseProxy.fetchData(query)
        assertEquals("Data for $query", result)
        verify(realDatabase, times(1)).fetchData(query)
    }

    @Test
    fun `Test fetch data with cache hit`() {
        val realDatabase = mock(RealDatabase::class.java)
        val databaseProxy = DatabaseProxy(realDatabase)

        val query = "SELECT * FROM users"
        `when`(realDatabase.fetchData(query)).thenReturn("Data for $query")

        // First call: should hit the real database
        databaseProxy.fetchData(query)
        // Second call: should hit the cache
        val result = databaseProxy.fetchData(query)

        assertEquals("Data for $query", result)
        verify(realDatabase, times(1)).fetchData(query) // Ensures the database is hit only once
    }
}