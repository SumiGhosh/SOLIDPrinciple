package com.sumi.solidprinciple.vehicle.ocp.solution

class DrivingSportMode: DrivingMode {

    private val POWER = 500
    private val SUSPENSION_HEIGHT = 10

    override fun getPower():Int {
        return POWER
    }

    override fun getSuspensionHeight():Int {
        return SUSPENSION_HEIGHT
    }
}