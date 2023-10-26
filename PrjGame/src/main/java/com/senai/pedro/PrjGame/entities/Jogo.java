package com.senai.pedro.PrjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "tb_jogo")
public class Jogo {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String name;
		
		private String plataform;
		
		public Jogo() {
			
		}

		public Jogo(Long id, String nome, String plataforma) {
			super();
			this.id = id;
			this.name = nome;
			this.plataform = plataforma;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long Id) {
			this.id = Id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPlataform() {
			return plataform;
		}
		public void setPlataform(String plataform) {
			this.plataform = plataform;
		}
	
	}