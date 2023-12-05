package com.devstromo.behavioral.state.traffic_light

class YellowState : TrafficLightState {
    override fun show() {
        println("Traffic Light is in Yellow")
    }
}