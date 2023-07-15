package com.doctores.doctores.controllers

import com.doctores.doctores.constants.HEALTH_CHECK
import com.doctores.doctores.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import  org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {
    @GetMapping(HEALTH_CHECK)
    fun healthCheck(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}