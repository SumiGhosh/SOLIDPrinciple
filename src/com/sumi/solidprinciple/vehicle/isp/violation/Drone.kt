package com.sumi.solidprinciple.vehicle.isp.violation

class Drone: Vehicle() {

    private var isCameraOn = false
    override fun turnRadioOn() {
        isCameraOn = true
    }

    override fun turnRadioOff() {
        isCameraOn = false
    }

    //We are forcing to have these functions in the class
    override fun turnCameraOn() {
        TODO("Not required")
    }

    override fun turnCameraOff() {
        TODO("Not required")
    }
}