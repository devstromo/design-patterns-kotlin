package com.devstromo.behavioral.state.traffic_light

class GreenState : TrafficLightState {
    override fun show() {
        println("Traffic Light is in Green")
    }
}