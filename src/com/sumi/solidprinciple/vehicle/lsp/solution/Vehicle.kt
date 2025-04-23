package com.sumi.solidprinciple.vehicle.lsp.solution

import kotlin.properties.Delegates

open class Vehicle() {

    private var isMoving by Delegates.notNull<Boolean>()
    private lateinit var gear: Gear

    fun move() {
        isMoving = true
    }

    fun stop() {
        isMoving = false
    }

    fun isMoving(): Boolean {
        return isMoving
    }

    fun getGear(): Gear{
        return gear
    }

    open fun changeGear(gear: Gear) {
        this.gear = gear
    }
}