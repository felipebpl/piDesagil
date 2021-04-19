package br.edu.insper.desagil.questao2;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
	private List<Produto> produtos;
	
	
	public Vendedor(String nome, List<Produto> produtos) {
		super(nome);
		this.produtos = new ArrayList<>();
	}

	public void cadastraProduto(Produto produto) {
		produtos.add(produto);
				
	}
	

}
