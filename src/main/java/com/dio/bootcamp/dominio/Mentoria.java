package com.dio.bootcamp.dominio;

import java.util.Date;
import java.util.Objects;

public class Mentoria {
	
	private Integer id;
	private String titulo;
	private String descricao;
	private Date data;
	
	public Mentoria() {
	}

	public Mentoria(Integer id, String titulo, String descricao, Date data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
		Mentoria other = (Mentoria) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Mentoria [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
	

}
