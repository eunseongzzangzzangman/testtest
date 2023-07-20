package com.example.extest0221

class RegisterProcessor {
    fun processRegister(user: User) {
        val loginProcessor = LoginProcessor()
        loginProcessor.processLogin(user)
    }
}