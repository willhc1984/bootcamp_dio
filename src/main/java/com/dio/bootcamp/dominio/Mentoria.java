package com.dio.bootcamp.dominio;

import java.util.Date;

public class Mentoria extends Conteudo{
	
	private static final long serialVersionUID = 1L;
	
	private Date data;
	
	public Mentoria() {
	}

	public Mentoria(Integer id, String titulo, String descricao, Date data) {
		super(id, titulo, descricao);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

		

}
