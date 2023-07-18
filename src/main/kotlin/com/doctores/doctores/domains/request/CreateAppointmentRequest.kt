package com.doctores.doctores.domains.request

import org.jetbrains.annotations.NotNull

data class CreateAppointmentRequest(
    val idPaciente: String,
    val especialidad: String,
    val idDoctor: Long,
    val horario: String

)