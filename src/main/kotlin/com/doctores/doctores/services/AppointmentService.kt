package com.doctores.doctores.services

import com.doctores.doctores.domains.request.CreateAppointmentRequest
import com.doctores.doctores.domains.request.CreateDoctorRequest
import com.doctores.doctores.domains.responses.CreateAppointmentResponse
import com.doctores.doctores.domains.responses.CreateDoctorResponse
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class AppointmentService {

    fun createAppointment(request: CreateAppointmentRequest): CreateAppointmentResponse{
        return CreateAppointmentResponse(
            idPaciente = "1",
            especialidad = request.especialidad,
            doctor = "Carlos",
            consultorio = 101,
            horario = "16"
        )
    }

    fun getAllAppointments(): List<CreateAppointmentResponse>{
        var response : List<CreateAppointmentResponse> = listOf(
            CreateAppointmentResponse(
                idPaciente = "1",
                especialidad = "Test",
                doctor = "Carlos",
                consultorio = 101,
                horario = "16"
            )
        )
        return response
    }

    fun getAppointmentById(id: Long): CreateAppointmentResponse{
        return CreateAppointmentResponse(
            idPaciente = "1",
            especialidad = "Test",
            doctor = "Carlos",
            consultorio = 101,
            horario = "16"
        )
    }

    fun updateAppointment(id: Long): CreateAppointmentResponse{
        return CreateAppointmentResponse(
            idPaciente = "1",
            especialidad = "Test",
            doctor = "Carlos",
            consultorio = 101,
            horario = "16"
        )
    }
}