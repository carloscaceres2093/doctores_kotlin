package com.doctores.doctores.domains.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.*
import java.time.Instant


@Entity
@Table(name = "doctores")
open class Doctor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_doctor")
    open var idDoctor: Long=0,

    @Column(name="nombre")
    open var nombre: String,

    @Column(name="apellido")
    open var apellido: String,

    @Column(name="especialidad")
    open var especialidad: String,

    @Column(name="consultorio")
    open var consultorio: Long,

    @Column(name="correo")
    open var correo: String?="",

    @Column(name="created_at")
    open var createdAt: Instant = Instant.now(),

)