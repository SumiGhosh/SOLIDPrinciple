package com.sumi.solidprinciple.vehicle.isp.violation

abstract class Vehicle: Switches {

    private var engineRunning: Boolean = false

    fun isEngineRunning(): Boolean {
        return engineRunning
    }

    override fun startEngine() {
        engineRunning = true
    }

    override fun stopEngine() {
        engineRunning = false
    }
}