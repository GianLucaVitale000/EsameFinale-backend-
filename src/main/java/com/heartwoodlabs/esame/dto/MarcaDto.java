package com.heartwoodlabs.esame.dto;

public class MarcaDto {

    private String nome;


    public MarcaDto(){}

    public MarcaDto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "MarcaDto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
