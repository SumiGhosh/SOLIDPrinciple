package com.sumi.solidprinciple.vehicle.isp.solution

open class Vehicle: EngineSwitch{

    private var isStartEngine = false

    override fun startEngine() {
        isStartEngine = true
    }

    override fun stopEngine() {
        isStartEngine = false
    }

}