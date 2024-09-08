package com.heartwoodlabs.esame.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false)
    private String nome;



    public Marca() {}
    public Marca(String nome) {
        this.nome = nome;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return Objects.equals(id, marca.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
