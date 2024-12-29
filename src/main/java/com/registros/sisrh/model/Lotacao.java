package com.registros.sisrh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Lotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LotacaoId;
    
    @NotBlank
    private String lotacaoNome;

    public Long getLotacaoId() {
        return LotacaoId;
    }

    public void setLotacaoId(Long lotacaoId) {
        LotacaoId = lotacaoId;
    }

    public String getLotacaoNome() {
        return lotacaoNome;
    }

    public void setLotacaoNome(String lotacaoNome) {
        this.lotacaoNome = lotacaoNome;
    }

    

}
