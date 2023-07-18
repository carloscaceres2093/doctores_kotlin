package com.doctores.doctores.services

import com.doctores.doctores.domains.request.CreateDoctorRequest
import com.doctores.doctores.domains.responses.CreateDoctorResponse
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class DoctorService {

    fun createDoctor(request: CreateDoctorRequest): CreateDoctorResponse{
        return CreateDoctorResponse(
            idDoctor = 1,
            nombre = request.nombre,
            apellido = request.apellido,
            especialidad = request.especialidad,
            correo = request.correo,
            consultorio = request.consultorio,
            createAt = Instant.now()
        )
    }

    fun getAllDoctors(): List<CreateDoctorResponse>{
        var response : List<CreateDoctorResponse> = listOf(
            CreateDoctorResponse(
                idDoctor = 1,
                nombre = "test",
                apellido = "test",
                especialidad = "test",
                correo = "test",
                consultorio = 123,
                createAt = Instant.now()
            )
        )
        return response
    }

    fun getDoctorById(id: Long): CreateDoctorResponse{
        return CreateDoctorResponse(
            idDoctor = 1,
            nombre = "test",
            apellido = "test",
            especialidad = "test",
            correo = "test",
            consultorio = 123,
            createAt = Instant.now()
        )
    }

    fun updateDoctor(id: Long): CreateDoctorResponse{
        return CreateDoctorResponse(
            idDoctor = 1,
            nombre = "test",
            apellido = "test",
            especialidad = "test",
            correo = "test",
            consultorio = 123,
            createAt = Instant.now()
        )
    }
}