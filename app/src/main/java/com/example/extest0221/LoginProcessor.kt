package com.example.extest0221

class LoginProcessor {
    fun processLogin(user: User) {
        if(user.id == "admin" && user.pw == "1234") {
            println("로그인 성공")
        }else{
            println("로그인 실패")
        }
    }
}