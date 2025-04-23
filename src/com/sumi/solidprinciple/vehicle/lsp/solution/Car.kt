package com.sumi.solidprinciple.vehicle.lsp.solution

class Car: Vehicle() {

    override fun changeGear(gear: Gear) {
        val actualGear = getGear()
        if(isMovingForward(gear,actualGear) ||
            isMovingBackward(gear, actualGear)) {
            stop()
        }
        super.changeGear(gear)
    }

    private fun isMovingBackward(gear: Gear, actualGear: Gear): Boolean {
        return isMoving() && actualGear == Gear.REVERSE && gear == Gear.DRIVE
    }

    private fun isMovingForward(gear: Gear, actualGear: Gear): Boolean {
        return isMoving() && actualGear == Gear.DRIVE && gear == Gear.REVERSE
    }
}