package com.sumi.solidprinciple.vehicle.lsp.violation

class Car: Vehicle() {

    override fun changeGear(gear: Gear) {
        if(gear == Gear.REVERSE && getGear() == Gear.DRIVE) {
            throw  RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
    }
}