package com.devstromo.creational.builder.car


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CarBuilderPatternUnitTest {
    @Test
    fun `Test Builder Pattern`() {
        val builder = ConcreteCarBuilder()
        val car = builder.buildEngine("V8").buildWheels(4).buildColor("Red").build()
        assertEquals("Car(engine=V8, wheels=4, color=Red)", car.toString())
    }

}