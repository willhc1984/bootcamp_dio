package com.dio.bootcamp;

import java.util.Arrays;
import java.util.Date;

import com.dio.bootcamp.dominio.Bootcamp;
import com.dio.bootcamp.dominio.Curso;
import com.dio.bootcamp.dominio.Dev;
import com.dio.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso c1 = new Curso(1, "Java 8", "Java 8", 7);
		Curso c2 = new Curso(2, "Spring Framework", "Spring Framework", 8);
		Mentoria m1 = new Mentoria(1, "Mentoria de Java 8", "Mentoria de Java 8", new Date());
		Mentoria m2 = new Mentoria(2, "Mentoria de Spring", "Mentoria de Spring", new Date());
		
		Bootcamp bootcamp = new Bootcamp(1, "Bootcamp Java DIO", "Bootcamp DIO 2022");
		bootcamp.getConteudos().addAll(Arrays.asList(c1, c2, m1, m2));
		
		Dev camila = new Dev(1, "Camila");
		Dev william = new Dev(2, "William Henrique");
		
		camila.inscreverBootcamp(bootcamp);
		william.inscreverBootcamp(bootcamp);
		
		camila.progredir();
		william.progredir();
		System.out.println("Conteudos inscritos Camila:" + camila.getConteudosInscritos());
		System.out.println("Conteudos concluidos Camila:" + camila.getConteudosConcluidos());
		System.out.println("XP: " + camila.calcularTotalXp());
		System.out.println();
		System.out.println("Conteudos inscritos William:" + william.getConteudosInscritos());
		System.out.println("Conteudos concluidos William:" + william.getConteudosConcluidos());
		System.out.println("XP: " + william.calcularTotalXp());
		
		camila.progredir();		
		william.progredir();
		camila.progredir();		
		william.progredir();
		
		System.out.println();
		System.out.println("Conteudos inscritos Camila:" + camila.getConteudosInscritos());
		System.out.println("Conteudos concluidos Camila:" + camila.getConteudosConcluidos());
		System.out.println("XP: " + camila.calcularTotalXp());
		System.out.println();
		System.out.println("Conteudos inscritos William:" + william.getConteudosInscritos());
		System.out.println("Conteudos concluidos William:" + william.getConteudosConcluidos());
		System.out.println("XP: " + william.calcularTotalXp());
		

	}

}