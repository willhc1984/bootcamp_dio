package com.dio.bootcamp;

import java.util.Date;

import com.dio.bootcamp.dominio.Curso;
import com.dio.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso(1, "Curso Java", "Java Completo", 5);
		Curso curso2 = new Curso(1, "Curso Javascript", "Javascript Completo", 15);
		Mentoria mentoria1 = new Mentoria(1, "Mentoria de Java", "Mentoria de Java", new Date());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);

	}

}
