package com.registros.sisrh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Formacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formacaoId;

    @NotBlank
    private String formacaoNome;

    private String formacaoDocumento;

    public Long getFormacaoId() {
        return formacaoId;
    }

    public void setFormacaoId(Long formacaoId) {
        this.formacaoId = formacaoId;
    }

    public String getFormacaoNome() {
        return formacaoNome;
    }

    public void setFormacaoNome(String formacaoNome) {
        this.formacaoNome = formacaoNome;
    }

    public String getFormacaoDocumento() {
        return formacaoDocumento;
    }

    public void setFormacaoDocumento(String formacaoDocumento) {
        this.formacaoDocumento = formacaoDocumento;
    }

    
}
