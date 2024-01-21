package com.devstromo.behavioral.mediator.pattern

class AirTrafficControlTower : AirTrafficController {
    private val registeredAirplanes: MutableSet<Airplane> = mutableSetOf()
    override fun registerAirplane(airplane: Airplane) {
        registeredAirplanes.add(airplane)
    }

    override fun deregisterAirplane(airplane: Airplane) {
        registeredAirplanes.remove(airplane)
    }

    override fun requestTakeOff(airplane: Airplane) {
        if (registeredAirplanes.contains(airplane)) {
            airplane.notifyTakeOff()
        }
    }

    override fun requestLanding(airplane: Airplane) {
        if (!registeredAirplanes.contains(airplane)) {
            airplane.notifyLanding()
        }
    }
}