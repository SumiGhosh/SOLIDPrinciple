package com.sumi.solidprinciple.vehicle.isp.solution

class Drone: Vehicle(), CameraSwitch {

    private var isCameraOn = false

    override fun isCameraOn() {
        isCameraOn = true
    }

    override fun isCameraOff() {
        isCameraOn = false
    }
}