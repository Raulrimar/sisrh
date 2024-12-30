package com.registros.sisrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registros.sisrh.repository.FormacaoRepository;
import com.registros.sisrh.model.Formacao;


@Service
public class FormacaoService {
      
    @Autowired
    private FormacaoRepository formacaoRepository;

    public Formacao criaFormacao(Formacao formacao) {
    return formacaoRepository.save(formacao);
    
    }


}
