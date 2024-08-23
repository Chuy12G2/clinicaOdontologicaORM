package com.dh.clinicaOdontologicaORM.repository;

import com.dh.clinicaOdontologicaORM.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Integer> {

}
