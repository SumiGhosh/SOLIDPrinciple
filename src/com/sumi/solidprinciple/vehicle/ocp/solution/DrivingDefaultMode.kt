package com.sumi.solidprinciple.vehicle.ocp.solution

class DrivingDefaultMode : DrivingMode {

    private val POWER = 400
    private val SUSPENSION_HEIGHT = 20

    override fun getPower():Int {
        return POWER
    }

    override fun getSuspensionHeight():Int {
        return SUSPENSION_HEIGHT
    }
}