package com.dio.bootcamp.dominio;

import java.io.Serializable;
import java.util.Objects;

public abstract class Conteudo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	protected final static Double XP_PADRAO = 10d;
	
	private Integer id;
	private String titulo;
	private String descricao;
	
	public Conteudo() {
	}
	
	public Conteudo(Integer id, String titulo, String descricao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public abstract double calcularXp();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteudo other = (Conteudo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Conteudo [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}	

}
