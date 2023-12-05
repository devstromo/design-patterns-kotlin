package com.devstromo.behavioral.state.traffic_light

fun main() {
    val initialState = RedState()
    val trafficLight = TrafficLight(initialState)
    trafficLight.showCurrentState()
    trafficLight.changeState(YellowState())
    trafficLight.showCurrentState()
    trafficLight.changeState(GreenState())
    trafficLight.showCurrentState()
}