package dev.hvpaiva.smart.shopper.basic.list

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BasicListApplication

fun main(args: Array<String>) {
    runApplication<BasicListApplication>(*args)
}