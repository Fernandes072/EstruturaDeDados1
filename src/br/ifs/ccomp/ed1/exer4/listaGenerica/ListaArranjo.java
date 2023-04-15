package br.ifs.ccomp.ed1.exer4.listaGenerica;

public class ListaArranjo<T> implements Lista<T> {
	
	private Object[] arranjo = new Object[100];
	
	private int total = 0;
	
	public void adiciona(T elemento) {
		aumentarTamanho();
		arranjo[total] = elemento;
		total++;
	}
	
	public void adicionaLinear(T elemento) {
		aumentarTamanho();
		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] == null) {
				arranjo[i] = elemento;
				total++;
				break;
			}
		}
	}
	
	public void adiciona(int posicao, T elemento) {
		if (posicao <= total) {
			aumentarTamanho();
			if(posicao < total) {
				for (int i = total; i >= posicao; i--) {
					arranjo[i] = arranjo[i-1];
				}
			}
			arranjo[posicao] = elemento;
			total++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T pega(int posicao) {
		if (posicao >= arranjo.length) {
			return null;
		}
		return (T) arranjo[posicao];
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
			Object[] novoArranjo = new Object[arranjo.length*2];
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
			} if (arranjo[i] instanceof Aluno) {
				Aluno aluno = (Aluno) arranjo[i];
				resultado += aluno.getMatricula() + "-" + aluno.getNome();
			} else {
				resultado += arranjo[i];
			}
		}
		resultado += "]";
		return resultado;
	}
}