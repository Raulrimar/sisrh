package com.registros.sisrh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registros.sisrh.model.Lotacao;

public interface LotacaoRepository extends JpaRepository<Lotacao, Long> {
    
}
