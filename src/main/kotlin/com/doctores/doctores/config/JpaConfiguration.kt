package com.doctores.doctores.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories("com.doctores.doctores.domains.entity")
class JpaConfiguration {
}