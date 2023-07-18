package com.doctores.doctores.domains.responses

import java.time.Instant
data class CreateDoctorResponse(
    val idDoctor: Long,
    val nombre: String,
    val apellido: String,
    val especialidad: String,
    val consultorio: Long,
    val correo: String?,
    val createAt: Instant
)
