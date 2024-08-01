package Teste;

import java.util.List;

import java.util.ArrayList;

public class ListaCarros {	
	public List<Carros> catalogoCarros;

	public ListaCarros() {
		this.catalogoCarros = new ArrayList<>();
	}
	
	public void adicionarCarro(String nome, String marca, int numeracao, double velocidadeMaxima, int preco) {
		catalogoCarros.add(new Carros(nome, marca, numeracao, velocidadeMaxima, preco));
	}
	
	public List<Carros> pesquisarPorCarro(String nome){
		List<Carros> carroPorNome = new ArrayList<>();
		if(!catalogoCarros.isEmpty()) {
			for(Carros c : catalogoCarros) {
				if(c.getNome().equals(nome)) {
					carroPorNome.add(c);
				}
			}
		}
		return carroPorNome;
	}
	
	public

}
