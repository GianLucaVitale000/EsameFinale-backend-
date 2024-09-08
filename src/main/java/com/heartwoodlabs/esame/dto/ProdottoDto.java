package com.heartwoodlabs.esame.dto;

import java.math.BigDecimal;

public class ProdottoDto {

    private String nome;
    private String descrizione;
    private BigDecimal  prezzo;
    private String marca;

    public ProdottoDto() {}

    public ProdottoDto(String nome, String descrizione, BigDecimal prezzo, String marca) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProdottoDto{" +
                "nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", marca='" + marca + '\'' +
                '}';
    }
}
