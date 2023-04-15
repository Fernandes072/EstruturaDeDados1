package br.ifs.ccomp.ed1.exer4.listaGenericaTeste;

public abstract class Pessoa {
	
	private String nome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return getNome();
	}
}
