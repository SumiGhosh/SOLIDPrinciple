package com.sumi.solidprinciple.vehicle.ocp.solution

class ChangeVehicleDrivingMode(val vehicle: Vehicle) {

    fun changeDrivingMode(drivingMode: DrivingMode) {
        vehicle.setPower(drivingMode.getPower())
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight())
        // now, when we need to add another mode (e.g. Cruise) just create a new class: Cruise.
    }
}