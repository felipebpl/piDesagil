package br.edu.insper.desagil.questao2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class UsuarioTest {
	
	private static double DELTA = 0.01;

	private Video v;
	private Usuario usuario;
	private List<Video> avaliacoes;

	@BeforeEach
	public void setUp() {
		avaliacoes = new ArrayList<>();
	}

	@Test
	public void foraDosParametros () {
		
		v = new Video(1 , new Usuario("Usuario1"),new Produto("Agua",5.00));
		
		Usuario usuario1 = new Usuario("Usuario1");
		
		v.adicionaAvaliacao(usuario1, 0);
		v.adicionaAvaliacao(usuario1, 6);
		
		System.out.println(v);
		
		assertEquals(0, v.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void umaValida () {
		
		v = new Video(1 , new Usuario("Usuario1"),new Produto("Agua",5.00));
		
		Usuario usuario1 = new Usuario("Usuario1", 2.25);
		v.adicionaAvaliacao(usuario1, 3);
		
		assertEquals(3, v.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void duasValidas () {
		
		v = new Video(1 , new Usuario("Usuario1"),new Produto("Agua",5.00));
		Usuario usuario1 = new Usuario("Usuario1", 2.25);
				
		v.adicionaAvaliacao(usuario1, 4);
		v.adicionaAvaliacao(usuario1, 3);
		
		assertEquals(7, v.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void tresValidas () {
		
		v = new Video(1 , new Usuario("Usuario1"),new Produto("Agua",5.00));
		
		Usuario usuario1 = new Usuario("Usuario1", 2.25);
				
		v.adicionaAvaliacao(usuario1, 4);
		v.adicionaAvaliacao(usuario1, 3);
		v.adicionaAvaliacao(usuario1, 5);
	
		assertEquals(12, v.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void doisVideos () {
		
		v = new Video(1 , new Usuario("Usuario1"),new Produto("Agua",5.00));
		v2 = new Video(2 , new Usuario("Usuario2"),new Produto("Bala",2.50));
		
		Usuario usuario1 = new Usuario("Usuario1", 2.25);
				
		v.adicionaAvaliacao(usuario1, 4);
		v.adicionaAvaliacao(usuario1, 3);
		v.adicionaAvaliacao(usuario1, 5);
	
		assertEquals(12, v.totalAvaliacoes(), DELTA);
	}
	
	
	

}
