package com.sumi.solidprinciple.vehicle.lsp.violation

open class Vehicle() {

    private lateinit var gear: Gear

    fun getGear(): Gear{
        return gear
    }

    open fun changeGear(gear: Gear) {
        this.gear = gear
    }
}