package com.devstromo.structural.facade.persistence


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FacadePatternWithPersistenceUnitTest {
    @Test
    fun `Test Facade With Persistence`() {
        val userRepo = UserRepository()
        val user = User("adam")
        userRepo.save(user)
        val retrievedUser = userRepo.findFirst()
        val userValue = retrievedUser.login
        assertEquals("adam", userValue)
    }
}