package br.ifs.ccomp.ed1.materialprova;

public class Aluno {
	
	private int matricula;
	
	private String nome;
	
	public Aluno() {
		
	}
	
	public Aluno(int matricula, String nome) {
		setMatricula(matricula);
		setNome(nome);
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Matrícula: "+matricula+" / "+"Nome: "+nome;
	}
	
	public boolean equals(Object obj) {
		boolean retorno = false;
		if (obj != null && obj instanceof Aluno) {
			Aluno aluno = (Aluno) obj;
			if (matricula == aluno.getMatricula() && nome.equals(aluno.getNome())) {
				retorno = true;
			}
		}
		return retorno;
	}
}