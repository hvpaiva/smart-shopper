package dev.hvpaiva.smart.shopper.user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class UserApplication

fun main(args: Array<String>) {
    runApplication<UserApplication>(*args)
}