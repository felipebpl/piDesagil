package br.edu.insper.desagil.questao2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public List<Video> postaVideo(int id, Produto produto) {
		List<Video> video = new ArrayList<>();
		this.videos.add((Video) video);
		return this.videos;		
	}
	
	public int totalAvaliacoes(){
		int somaMedia = 0;
		for (int avaliacao : this.getAvaliacoes()){
			somaMedia += avaliacao;
			return somaMedia;
		}
			
		
		
	}

}
