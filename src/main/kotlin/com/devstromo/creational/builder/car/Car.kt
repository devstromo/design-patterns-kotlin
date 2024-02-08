package com.devstromo.creational.builder.car

class Car(var engine: String? = null, var wheels: Int? = null, var color: String? = null) {
    override fun toString() = "Car(engine=$engine, wheels=$wheels, color=$color)"
}