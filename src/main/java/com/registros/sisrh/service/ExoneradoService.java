package com.registros.sisrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registros.sisrh.model.Exonerado;
import com.registros.sisrh.repository.ExoneradoRepository;
@Service
public class ExoneradoService {
   @Autowired
    private ExoneradoRepository exoneradoRepository;

    public Exonerado criaExonerado(Exonerado exonerado) {
        return exoneradoRepository.save(exonerado);
    }
}
