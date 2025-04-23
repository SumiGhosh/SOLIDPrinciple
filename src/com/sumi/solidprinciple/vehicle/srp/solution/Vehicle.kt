package com.sumi.solidprinciple.vehicle.srp.solution

class Vehicle constructor(private val maxFuel:Int){

    private var remainingFuel:Int = maxFuel

    fun getMaxFuel():Int {
        return maxFuel
    }

    fun getRemainingFuel(): Int {
        return remainingFuel
    }

    fun setRemainingFuel(remainingFuel:Int) {
        this.remainingFuel = remainingFuel
    }

    fun accelerate() {
        remainingFuel--
    }

}