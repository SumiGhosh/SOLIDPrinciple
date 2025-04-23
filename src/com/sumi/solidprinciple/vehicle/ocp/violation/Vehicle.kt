package com.sumi.solidprinciple.vehicle.ocp.violation

class Vehicle {

    private var power: Int = 0
    private var suspensionHeight: Int = 0

    fun getPower(): Int {
        return power
    }

    fun setPower(power:Int) {
        this.power = power
    }

    fun getSuspensionHeight(): Int {
        return suspensionHeight
    }

    fun setSuspensionHeight(suspensionHeight:Int) {
        this.suspensionHeight = suspensionHeight
    }
}