package com.devstromo.behavioral.state.traffic_light

class TrafficLight(var state: TrafficLightState) {
    fun changeState(newState: TrafficLightState) {
        state = newState
    }

    fun showCurrentState() {
        state.show()
    }
}