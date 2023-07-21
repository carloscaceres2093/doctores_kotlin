package com.doctores.doctores

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(scanBasePackages = ["com.doctores.doctores"])
@ComponentScan("com.doctores.doctores.repositories")
class DoctoresApplication


fun main(args: Array<String>) {
	runApplication<DoctoresApplication>(*args)
}
