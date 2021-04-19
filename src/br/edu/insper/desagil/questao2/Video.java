package br.edu.insper.desagil.questao2;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario ,Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	} 
	
	public int getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Produto getProduto() {
		return produto;
	}


	public Map<Usuario, Integer> getAvaliacoes() {
		return avaliacoes;
	}

	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		if (usuario.getNome() != this.getProduto().getNome()) {
			if (avaliacao>1 && avaliacao<5) {
				this.avaliacoes.put(usuario, avaliacao);
			}	
		}	
	}
	
	public int mediaAvaliacoes() {
		double media = 0 ;
		double total = 0;
		for (int avaliacao : this.avaliacoes.values()){
			total += avaliacao;
			media = (total  /  avaliacoes.size());
		}
		int intMedia = (int) Math.round(media);
		return intMedia ;
	}
		
	

}
