package com.sumi.solidprinciple.vehicle.ocp.solution

fun main() {

    val vehicle = Vehicle()
    val drivingModeDefault = DrivingDefaultMode()
    val changeDrivingMode = ChangeVehicleDrivingMode(vehicle)
    changeDrivingMode.changeDrivingMode(drivingModeDefault)

    printVehicleDetails(vehicle)

    val drivingModeSport = DrivingSportMode()
    changeDrivingMode.changeDrivingMode(drivingModeSport)

    printVehicleDetails(vehicle)
}

fun printVehicleDetails(vehicle: Vehicle) {
    System.out.println("Power set to : ${vehicle.getPower()}")
    System.out.println("Suspension height set to: ${vehicle.getSuspensionHeight()}")
}