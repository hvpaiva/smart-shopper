package dev.hvpaiva.smart.shopper.shopping.list

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ShoppingListApplication

fun main(args: Array<String>) {
    runApplication<ShoppingListApplication>(*args)
}