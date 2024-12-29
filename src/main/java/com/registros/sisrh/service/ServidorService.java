package com.registros.sisrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registros.sisrh.model.Servidor;
import com.registros.sisrh.repository.ServidorRepository;

@Service
public class ServidorService {
    // criando objeto para acessar diretamento a camada de repositório
    @Autowired //injeção de dependencias (insjeta objeto de servidorRepository)
    private ServidorRepository servidorRepository;

    //Criando metodo para buscar todos os servidores
    public Servidor criaServidor(Servidor servidor) {
        return servidorRepository.save(servidor);
    }

}
