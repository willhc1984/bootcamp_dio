package com.dio.bootcamp.dominio;

public class Curso extends Conteudo{
	
	private static final long serialVersionUID = 1L;
	
	private Integer cargaHoraria;
	
	public Curso() {
	}

	public Curso(Integer id, String titulo, String descricao, Integer cargaHoraria) {
		super(id, titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXp() {		
		return XP_PADRAO * cargaHoraria;
	}

	@Override
	public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

	

	
	
}
