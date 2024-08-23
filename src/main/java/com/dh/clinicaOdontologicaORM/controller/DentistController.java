package com.dh.clinicaOdontologicaORM.controller;

import com.dh.clinicaOdontologicaORM.entities.Dentist;
import com.dh.clinicaOdontologicaORM.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentist")
public class DentistController{

    private final DentistService dentistService;

    @Autowired
    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    @PostMapping
    public Dentist save(@RequestBody Dentist dentist) {
        return dentistService.save(dentist);
    }

    @GetMapping
    public List<Dentist> findAll() {
        return dentistService.findAll();
    }
}
