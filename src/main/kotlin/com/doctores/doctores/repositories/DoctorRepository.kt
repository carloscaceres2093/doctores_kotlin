package com.doctores.doctores.repositories

import com.doctores.doctores.domains.entity.Doctor
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional


interface DoctorRepository : JpaRepository<Doctor, Long> {
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from doctores where id_doctor = :id", nativeQuery = true)
    fun getByDoctorId(id: Long): Doctor?
}