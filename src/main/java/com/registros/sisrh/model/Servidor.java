package com.registros.sisrh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String servidorFoto;
    
    @NotBlank
    private String servidorNome;

    @NotBlank
    private String servidorSexo;

    @NotBlank
    private String servidorMatricula;

    @NotBlank
    private String servidorLotacao;

    @NotBlank
    private String servidorMunicipio;

    @NotBlank
    private String servidorCargo;

    @NotBlank
    private String servidorFormacao;

    @NotBlank
    private String servidorDataAdmissao;

    @NotBlank
    private String servidorClasse;

    @NotBlank
    private String servidorTelefone;

    private String servidorProxPromocao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServidorFoto() {
        return servidorFoto;
    }

    public void setServidorFoto(String servidorFoto) {
        this.servidorFoto = servidorFoto;
    }

    public String getServidorNome() {
        return servidorNome;
    }

    public void setServidorNome(String servidorNome) {
        this.servidorNome = servidorNome;
    }

    public String getServidorSexo() {
        return servidorSexo;
    }

    public void setServidorSexo(String servidorSexo) {
        this.servidorSexo = servidorSexo;
    }

    public String getServidorMatricula() {
        return servidorMatricula;
    }

    public void setServidorMatricula(String servidorMatricula) {
        this.servidorMatricula = servidorMatricula;
    }

    public String getServidorLotacao() {
        return servidorLotacao;
    }

    public void setServidorLotacao(String servidorLotacao) {
        this.servidorLotacao = servidorLotacao;
    }

    public String getServidorMunicipio() {
        return servidorMunicipio;
    }

    public void setServidorMunicipio(String servidorMunicipio) {
        this.servidorMunicipio = servidorMunicipio;
    }

    public String getServidorCargo() {
        return servidorCargo;
    }

    public void setServidorCargo(String servidorCargo) {
        this.servidorCargo = servidorCargo;
    }

    public String getServidorFormacao() {
        return servidorFormacao;
    }

    public void setServidorFormacao(String servidorFormacao) {
        this.servidorFormacao = servidorFormacao;
    }

    public String getServidorDataAdmissao() {
        return servidorDataAdmissao;
    }

    public void setServidorDataAdmissao(String servidorDataAdmissao) {
        this.servidorDataAdmissao = servidorDataAdmissao;
    }

    public String getServidorClasse() {
        return servidorClasse;
    }

    public void setServidorClasse(String servidorClasse) {
        this.servidorClasse = servidorClasse;
    }

    public String getServidorTelefone() {
        return servidorTelefone;
    }

    public void setServidorTelefone(String servidorTelefone) {
        this.servidorTelefone = servidorTelefone;
    }

    public String getServidorProxPromocao() {
        return servidorProxPromocao;
    }

    public void setServidorProxPromocao(String servidorProxPromocao) {
        this.servidorProxPromocao = servidorProxPromocao;
    }



    
    
    
}
