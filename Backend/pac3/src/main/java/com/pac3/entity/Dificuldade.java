package com.pac3.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Dificuldade {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numeroCartas;
	private Long tempoLimite;

	@OneToMany(mappedBy="dificuldade")
    @JsonManagedReference
	private Set<Partida> partidas;
	
}
