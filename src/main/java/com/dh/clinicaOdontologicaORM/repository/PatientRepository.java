package com.dh.clinicaOdontologicaORM.repository;

import com.dh.clinicaOdontologicaORM.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
