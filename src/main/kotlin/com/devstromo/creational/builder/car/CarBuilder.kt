package com.devstromo.creational.builder.car

interface CarBuilder {
    fun buildEngine(engine: String): CarBuilder
    fun buildWheels(wheels: Int): CarBuilder
    fun buildColor(color: String): CarBuilder
    fun build(): Car
}
