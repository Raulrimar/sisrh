package com.registros.sisrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registros.sisrh.model.Lotacao;
import com.registros.sisrh.repository.LotacaoRepository;

@Service
public class LotacaoService {
    
    @Autowired
    private LotacaoRepository lotacaoRepository;

    public Lotacao criaLotacao(Lotacao lotacao) {
        return lotacaoRepository.save(lotacao);    
    }
}
