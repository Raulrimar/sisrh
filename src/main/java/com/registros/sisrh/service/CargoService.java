package com.registros.sisrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registros.sisrh.model.Cargo;
import com.registros.sisrh.repository.CargoRepository;

@Service
public class CargoService {
    
    @Autowired
    private CargoRepository cargoRepository;

    public Cargo criaCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }
}
