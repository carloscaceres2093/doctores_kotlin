package com.doctores.doctores.controllers

import com.doctores.doctores.constants.CreateDoctors
import com.doctores.doctores.constants.GetDoctorById
import com.doctores.doctores.constants.UpdateDoctor
import com.doctores.doctores.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import  org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

@RestController
class DoctorController {
    @GetMapping()
    fun getAllDoctors(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PostMapping(CreateDoctors)
    fun createDoctor(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @GetMapping(GetDoctorById)
    fun getDoctorById(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PutMapping(UpdateDoctor)
    fun updateDoctor(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}