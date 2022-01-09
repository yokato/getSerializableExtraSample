package com.example.myviewmodel

import java.io.Serializable

open class Car : Serializable{
    private val serialVersionUID = 1L
    var name: String? = "hoge"
    var id: String? = "fuga"
}
