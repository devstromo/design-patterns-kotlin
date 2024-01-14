package com.devstromo.structural.facade.persistence

/**
 * Facade
 */
class UserRepository {
    private val systemPreferences = ComplexSystemDataStore("/data/store.db")
    fun save(user: User) {
        systemPreferences.store("USER_DATA_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_DATA_KEY"))
}