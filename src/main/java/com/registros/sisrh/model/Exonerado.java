package com.registros.sisrh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Exonerado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String ExoneradoFoto;

    @NotBlank
    private String ExoneradoNome;

    @NotBlank
    private String ExoneradoMatricula;

    @NotBlank
    private String ExoneradoCargo;

    @NotBlank
    private String ExoneradoSituacao;

    @NotBlank
    private String ExoneradoDataExoneracao;

    @NotBlank
    private String ExoneradoDoe;

    @NotBlank
    private String ExoneradoMunicipio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExoneradoFoto() {
        return ExoneradoFoto;
    }

    public void setExoneradoFoto(String exoneradoFoto) {
        ExoneradoFoto = exoneradoFoto;
    }

    public String getExoneradoNome() {
        return ExoneradoNome;
    }

    public void setExoneradoNome(String exoneradoNome) {
        ExoneradoNome = exoneradoNome;
    }

    public String getExoneradoMatricula() {
        return ExoneradoMatricula;
    }

    public void setExoneradoMatricula(String exoneradoMatricula) {
        ExoneradoMatricula = exoneradoMatricula;
    }

    public String getExoneradoCargo() {
        return ExoneradoCargo;
    }

    public void setExoneradoCargo(String exoneradoCargo) {
        ExoneradoCargo = exoneradoCargo;
    }

    public String getExoneradoSituacao() {
        return ExoneradoSituacao;
    }

    public void setExoneradoSituacao(String exoneradoSituacao) {
        ExoneradoSituacao = exoneradoSituacao;
    }

    public String getExoneradoDataExoneracao() {
        return ExoneradoDataExoneracao;
    }

    public void setExoneradoDataExoneracao(String exoneradoDataExoneracao) {
        ExoneradoDataExoneracao = exoneradoDataExoneracao;
    }

    public String getExoneradoDoe() {
        return ExoneradoDoe;
    }

    public void setExoneradoDoe(String exoneradoDoe) {
        ExoneradoDoe = exoneradoDoe;
    }

    public String getExoneradoMunicipio() {
        return ExoneradoMunicipio;
    }

    public void setExoneradoMunicipio(String exoneradoMunicipio) {
        ExoneradoMunicipio = exoneradoMunicipio;
    }

    
}
