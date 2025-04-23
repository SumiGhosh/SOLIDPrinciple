package com.sumi.solidprinciple.vehicle.isp.solution

class Car:Vehicle(),RadioSwitch {

    private var isRadioOn = false
    override fun isRadioOn() {
        isRadioOn = true
    }

    override fun isRadioOff() {
        isRadioOn = false
    }
}