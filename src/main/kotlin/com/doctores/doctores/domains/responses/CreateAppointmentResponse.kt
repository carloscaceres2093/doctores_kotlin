package com.doctores.doctores.domains.responses

import java.time.Instant
data class CreateAppointmentResponse(
    val idPaciente: String,
    val especialidad: String,
    val doctor: String,
    val consultorio: Long,
    val horario: String
)
