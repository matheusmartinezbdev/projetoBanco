package com.projeto.banco.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "conta")
    private Integer conta;
}
