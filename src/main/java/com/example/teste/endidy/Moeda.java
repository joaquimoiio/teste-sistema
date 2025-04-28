package com.example.teste.endidy;

import com.example.teste.enuns.MoedaPrefixo;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "TBMOEDA")
public class Moeda {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private BigDecimal id;
    @NotNull
    @Column(unique = true)
    private String sigla;
    @NotNull
    private String nome;
    @Enumerated(EnumType.STRING)
    private Double prefixoCotacao;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrefixoCotacao() {
        return prefixoCotacao;
    }

    public void setPrefixoCotacao(Double prefixoCotacao) {
        this.prefixoCotacao = prefixoCotacao;
    }

    public Moeda(long l, String usd, String dolar, MoedaPrefixo moedaPrefixo) {
    }

    public Moeda(BigDecimal id, String sigla, String nome, Double prefixoCotacao) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.prefixoCotacao = prefixoCotacao;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "id=" + id +
                ", sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                ", prefixoCotacao=" + prefixoCotacao +
                '}';
    }
    public static void main(String[] args){
        Moeda moeda = new Moeda(1L,"USD","DOLAR", MoedaPrefixo.USD);
        System.out.println("Constrturo com 2 Parametros"+moeda.toString());
    }
}