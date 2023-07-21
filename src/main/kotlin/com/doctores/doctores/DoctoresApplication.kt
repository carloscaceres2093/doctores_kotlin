package com.doctores.doctores

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication()
@EnableJpaRepositories("com.doctores.doctores.repositories")
@EntityScan("com.doctores.doctores.domains.entity")
class DoctoresApplication


fun main(args: Array<String>) {
	runApplication<DoctoresApplication>(*args)
}
