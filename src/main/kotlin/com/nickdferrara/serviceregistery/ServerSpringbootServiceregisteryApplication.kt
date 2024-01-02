package com.nickdferrara.serviceregistery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServerSpringbootServiceregisteryApplication

fun main(args: Array<String>) {
    runApplication<ServerSpringbootServiceregisteryApplication>(*args)
}
