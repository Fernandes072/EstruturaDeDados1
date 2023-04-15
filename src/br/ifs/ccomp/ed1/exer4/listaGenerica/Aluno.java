package br.ifs.ccomp.ed1.exer4.listaGenerica;

public class Aluno {
	
	private String nome;
	
	private int matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int matricula) {
		setNome(nome);
		setMatricula(matricula);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return getMatricula()+"-"+getNome();
	}
}