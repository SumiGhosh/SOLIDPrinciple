package com.sumi.solidprinciple.vehicle.ocp.violation

class ChangeVehicleDrivingMode(val vehicle:Vehicle) {

    fun changeDrivingMode(drivingMode: DrivingMode) {
        //If we add further driving modes, we need to change two classes further to accommodate them.
        when(drivingMode) {
            DrivingMode.SPORT -> {
                vehicle.setPower(500)
                vehicle.setSuspensionHeight(10)
            }
            DrivingMode.ECONOMY -> {
                vehicle.setPower(300)
                vehicle.setSuspensionHeight(20)
            }
            DrivingMode.DEFAULT -> {
                vehicle.setPower(400)
                vehicle.setSuspensionHeight(20)
            }
        }
    }
}