package com.sumi.solidprinciple.vehicle.isp.violation

class Car: Vehicle() {

    private var isRadioOn: Boolean = false

    override fun turnRadioOn() {
        isRadioOn = true
    }

    override fun turnRadioOff() {
        isRadioOn = false
    }

    override fun turnCameraOn() {
        TODO("Not required")
    }

    override fun turnCameraOff() {
        TODO("Not required")
    }
}