package com.github.lea_ecco.data_layer.base

class Message(var service: String, var action: String) {
    var message = ""
    var uuid = ""
    var success = false
}
