package com.registros.sisrh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registros.sisrh.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
