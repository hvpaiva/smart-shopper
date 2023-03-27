package dev.hvpaiva.smart.shopper.price

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class PriceApplication

fun main(args: Array<String>) {
    runApplication<PriceApplication>(*args)
}