package br.edu.insper.desagil.questao2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class classTest {
	
	private static double DELTA = 0.01;

	private Classe e;
	private List<Integer> codigos;

	@BeforeEach
	public void setUp() {
		e = new Classe("");
		codigos = new ArrayList<>();
	}

	@Test
	void () {
		e.cadastra(1, new Classe("Coca-Cola", 1.25));
		e.cadastra(2, new Classe("Fritas", 2.50));
		e.cadastra(3, new Classe("Big Mac", 3.75));

		codigos.add(2);
		codigos.add(3);
		assertEquals(6.25, e.processa(codigos), DELTA);		
	}

}
