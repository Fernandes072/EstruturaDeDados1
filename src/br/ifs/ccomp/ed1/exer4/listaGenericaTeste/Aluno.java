package br.ifs.ccomp.ed1.exer4.listaGenericaTeste;

public class Aluno extends Pessoa{
	
	private int matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int matricula) {
		super(nome);
		setMatricula(matricula);
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return getMatricula()+"-"+super.toString();
	}
}