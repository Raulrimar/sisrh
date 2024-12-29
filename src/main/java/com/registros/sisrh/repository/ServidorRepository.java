package com.registros.sisrh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registros.sisrh.model.Servidor;

public interface ServidorRepository extends JpaRepository<Servidor, Long> {
    
}
