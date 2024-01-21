package com.devstromo.behavioral.mediator.pattern

interface AirTrafficController {
    fun registerAirplane(airplane: Airplane)
    fun deregisterAirplane(airplane: Airplane)
    fun requestTakeOff(airplane: Airplane)
    fun requestLanding(airplane: Airplane)
}

class Airplane(private val registrationNumber: String, private val controller: AirTrafficController) {
    fun takeOff() {
        println("$registrationNumber is requesting takeoff.")
        controller.requestTakeOff(this)
    }

    fun land() {
        println("$registrationNumber is requesting landing.")
        controller.requestLanding(this)
    }

    fun notifyTakeOff() {
        println("$registrationNumber has taken off.")
        controller.deregisterAirplane(this)
    }

    fun notifyLanding() {
        println("$registrationNumber has landed.")
        controller.registerAirplane(this)
    }
}