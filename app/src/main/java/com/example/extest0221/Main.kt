package com.example.extest0221

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("회원 가입 정보를 입력하세요.")
    print("ID: ")
    val id = sc.nextLine()

    print("PW: ")
    val pw = sc.nextLine()

    print("Email: ")
    val email = sc.nextLine()

    print("Phone: ")
    val phone = sc.nextLine()

    val user = User(id, pw, email, phone)

    val registerProcessor = RegisterProcessor()
    registerProcessor.processRegister(user)
}