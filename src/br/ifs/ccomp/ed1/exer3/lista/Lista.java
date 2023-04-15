package br.ifs.ccomp.ed1.exer3.lista;

public class Lista {
	
	private Aluno[] arranjo = new Aluno[100];
	
	private int total = 0;
	
	public void adiciona(Aluno aluno) {
		aumentarTamanho();
		arranjo[total] = aluno;
		total++;
	}
	
	public void adicionaLinear(Aluno aluno) {
		aumentarTamanho();
		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] == null) {
				arranjo[i] = aluno;
				total++;
				break;
			}
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		if (posicao <= total) {
			aumentarTamanho();
			if(posicao < total) {
				for (int i = total; i >= posicao; i--) {
					arranjo[i] = arranjo[i-1];
				}
			}
			arranjo[posicao] = aluno;
			total++;
		}
	}
	
	public Aluno pega(int posicao) {
		if (posicao >= arranjo.length) {
			return null;
		}
		return arranjo[posicao];
	}
	
	public void remove(int posicao) {
		if (posicao < total){
			for (int i = posicao; i <= total; i++) {
				arranjo[i] = arranjo[i+1];				
			}
			total--;
		}
	}
	
	public int tamanho() {
		return total;
	}
	
	public void Limpar() {
		for (int i = 0; i < total; i++) {
			arranjo[i] = null;
		}
		total = 0;
	}
	
	public void aumentarTamanho() {
		if (total == arranjo.length) {
			Aluno[] novoArranjo = new Aluno[arranjo.length*2];
			for (int i = 0; i < total; i++) {
				novoArranjo[i] = arranjo[i];
			}
			arranjo = novoArranjo;
		}
	}
	
	public String toString() {
		String resultado = "[";
		for (int i = 0; i<total; i++) {
			if (i>=1) {
				resultado += " / ";
			}
				resultado += arranjo[i].getMatricula() + "-" + arranjo[i].getNome();
		}
		resultado += "]";
		return resultado;
	}
}