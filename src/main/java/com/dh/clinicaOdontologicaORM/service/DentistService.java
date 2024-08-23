package com.dh.clinicaOdontologicaORM.service;

import com.dh.clinicaOdontologicaORM.entities.Dentist;
import com.dh.clinicaOdontologicaORM.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistService {

    private DentistRepository dentistRepository;

    @Autowired
    public DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    public Dentist save(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    public Optional<Dentist> findById(Integer id) {
        return dentistRepository.findById(id);
    }

    public void update(Dentist dentist) {
        dentistRepository.save(dentist);
    }

    public void deleteById(Integer id) {
        dentistRepository.deleteById(id);
    }

    public List<Dentist> findAll() {
        return dentistRepository.findAll();
    }

}
