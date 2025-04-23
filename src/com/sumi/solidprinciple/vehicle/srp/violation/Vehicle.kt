package com.sumi.solidprinciple.vehicle.srp.violation

class Vehicle(private var maxFuel: Int) {
    private var remainingFuel: Int = maxFuel

    //this is not the primary requirement in the vehicle responsibility
    fun reFuel() {
        remainingFuel = maxFuel
    }

    fun getMaxFuel():Int {
        return maxFuel
    }

    fun getRemainingFuel(): Int {
        return remainingFuel
    }

    fun setRemainingFuel(remainingFuel: Int) {
        this.remainingFuel = remainingFuel
    }

    fun accelerate() {
        remainingFuel--
    }
}