package com.doctores.doctores.controllers

import com.doctores.doctores.constants.CreateDoctors
import com.doctores.doctores.constants.Doctor
import com.doctores.doctores.constants.GetDoctorById
import com.doctores.doctores.constants.UpdateDoctor
import com.doctores.doctores.domains.request.CreateDoctorRequest
import com.doctores.doctores.domains.responses.CreateDoctorResponse
import com.doctores.doctores.services.DoctorService
import org.springframework.beans.factory.annotation.Autowired
import  org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody


@RestController
class DoctorController {
    @Autowired
    private lateinit var doctorService: DoctorService

    @GetMapping(Doctor)
    fun getAllDoctors(): List<CreateDoctorResponse> =doctorService.getAllDoctors()
    @PostMapping(CreateDoctors)
    fun createDoctor(
        @RequestBody @Validated request: CreateDoctorRequest
    ):CreateDoctorResponse = doctorService.createDoctor(request)
    @GetMapping(GetDoctorById)
    fun getDoctorById(
        @PathVariable("id") id: Long
    ): CreateDoctorResponse = doctorService.getDoctorById(id)
    @PutMapping(UpdateDoctor)
    fun updateDoctor(
        @PathVariable("id") id: Long
    ): CreateDoctorResponse = doctorService.updateDoctor(id)
}