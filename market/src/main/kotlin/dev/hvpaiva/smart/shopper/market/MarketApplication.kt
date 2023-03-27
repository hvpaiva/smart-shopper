package dev.hvpaiva.smart.shopper.market

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MarketApplication

fun main(args: Array<String>) {
    runApplication<MarketApplication>(*args)
}