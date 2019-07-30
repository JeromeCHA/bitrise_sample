package com.example.bitrisesample

interface Test {
    fun test(): String
}

class ProductionTest : Test {
    override fun test(): String = "ProductionTest"
}