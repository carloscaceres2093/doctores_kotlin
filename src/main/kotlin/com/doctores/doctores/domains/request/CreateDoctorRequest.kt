package com.doctores.doctores.domains.request

import org.jetbrains.annotations.NotNull

data class CreateDoctorRequest(
    @field:NotNull("Nombre is required")
    val nombre: String,

    val apellido: String,
    val especialidad: String,
    val consultorio: Long,
    val correo: String?

)