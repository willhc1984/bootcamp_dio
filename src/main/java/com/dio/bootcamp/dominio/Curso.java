package com.dio.bootcamp.dominio;

import java.util.Objects;

public class Curso {
	
	private Integer id;
	private String titulo;
	private String descricao;
	private Integer cargaHoraria;
	
	public Curso() {
	}
	
	public Curso(Integer id, String titulo, String descricao, Integer cargaHoraria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}

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

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
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
		Curso other = (Curso) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria
				+ "]";
	}	
	
}
