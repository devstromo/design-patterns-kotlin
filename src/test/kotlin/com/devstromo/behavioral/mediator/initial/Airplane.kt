package com.devstromo.behavioral.mediator.initial

class Airplane(val registrationNumber: String) {
    private val otherAirplanes: MutableList<Airplane> = mutableListOf()
    fun addAirplane(airplane: Airplane) {
        otherAirplanes.add(airplane)
    }

    fun removeAirplane(airplane: Airplane) {
        otherAirplanes.remove(airplane)
    }

    fun takeoff() {
        println("$registrationNumber is taking off.")
        otherAirplanes.forEach { it.removeAirplane(this) }
        otherAirplanes.clear()
    }

    fun land(otherAirplanes: List<Airplane>) {
        println("$registrationNumber is landing.")
        this.otherAirplanes.addAll(otherAirplanes)
        otherAirplanes.forEach { it.addAirplane(this) }
    }
}