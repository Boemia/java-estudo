package Teste;

public class Carros {

	private String nome;
	private String marca;
	private int numeracao;
	private double velocidadeMaxima;
	private int preco;
	
	public Carros(String nome, String marca, int numeracao, double velocidadeMaxima, int preco) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.numeracao = numeracao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumeracao() {
		return numeracao;
	}
	
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Carros [nome=" + nome + ", marca=" + marca + ", numeracao=" + numeracao + ", velocidadeMaxima="
				+ velocidadeMaxima + ", preco=" + preco + "]";
	}
	
	
	
}
