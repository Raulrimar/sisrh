package com.registros.sisrh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registros.sisrh.model.Formacao;

public interface FormacaoRepository extends JpaRepository<Formacao, Long> {
    
}
