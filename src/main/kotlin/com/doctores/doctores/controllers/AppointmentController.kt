package com.doctores.doctores.controllers
import com.doctores.doctores.constants.*
import com.doctores.doctores.domains.request.CreateAppointmentRequest
import com.doctores.doctores.domains.request.CreateDoctorRequest
import com.doctores.doctores.domains.responses.CreateAppointmentResponse
import com.doctores.doctores.domains.responses.HealthCheckResponse
import com.doctores.doctores.services.AppointmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class AppointmentController {
    @Autowired
    private lateinit var appointmentService: AppointmentService
    @GetMapping(Appointment)
    fun getAllAppointments(): List<CreateAppointmentResponse> = appointmentService.getAllAppointments()
    @PostMapping(CreateAppointments)
    fun createAppointment(
        @RequestBody request: CreateAppointmentRequest
    ): CreateAppointmentResponse = appointmentService.createAppointment(request)
    @GetMapping(GetAppointmentById)
    fun getAppointmentById(
        @PathVariable("id") id: Long
    ): CreateAppointmentResponse = appointmentService.getAppointmentById(id)
    @PutMapping(UpdateAppointment)
    fun updateAppointment(
        @PathVariable("id") id: Long
    ): CreateAppointmentResponse = appointmentService.updateAppointment(id)
}