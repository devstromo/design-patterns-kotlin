package com.devstromo.creational.builder.car

class ConcreteCarBuilder : CarBuilder {
    private val car = Car()

    override fun buildEngine(engine: String): CarBuilder {
        car.engine = engine
        return this
    }

    override fun buildWheels(wheels: Int): CarBuilder {
        car.wheels = wheels
        return this
    }

    override fun buildColor(color: String): CarBuilder {
        car.color = color
        return this
    }

    override fun build(): Car = car
}