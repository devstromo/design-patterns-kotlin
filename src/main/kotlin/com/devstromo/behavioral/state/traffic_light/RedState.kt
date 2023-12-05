package com.devstromo.behavioral.state.traffic_light

class RedState : TrafficLightState {
    override fun show() {
        println("Traffic Light is in Red")
    }
}