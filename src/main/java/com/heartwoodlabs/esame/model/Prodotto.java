package com.heartwoodlabs.esame.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descrizione;

    @Column(nullable = false)
    private BigDecimal prezzo;
    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;


    public Prodotto() {}

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, Marca marca) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.marca = marca;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(id, prodotto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", marca=" + marca +
                '}';
    }
}
