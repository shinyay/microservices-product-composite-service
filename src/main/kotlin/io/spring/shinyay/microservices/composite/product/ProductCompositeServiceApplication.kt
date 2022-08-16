package io.spring.shinyay.microservices.composite.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductCompositeServiceApplication

fun main(args: Array<String>) {
	runApplication<ProductCompositeServiceApplication>(*args)
}
