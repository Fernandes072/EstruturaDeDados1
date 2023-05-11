package br.ifs.ccomp.ed1.materialprova;

public class ListaArranjo<T> implements Lista<T> {
	
	private Object[] arranjo = new Object[100];
	
	private int quantidade = 0;

	public void adiciona(T elemento) {
		garanteEspaco();
		arranjo[quantidade] = elemento;
		quantidade++;
	}

	public void adiciona(int posicao, T elemento) {
		garanteEspaco();
		if (posicao < quantidade) {
			for (int i = quantidade; i > posicao; i--) {
				arranjo[i] = arranjo[i-1];
			}
		}
		arranjo[posicao] = elemento;
		quantidade++;
	}
	
	@SuppressWarnings("unchecked")
	public T pega(int posicao) {
		if (posicao>=arranjo.length) {
			return null;
		}
		return (T) arranjo[posicao];
	}

	public void remove(int posicao) {
		if (posicao < quantidade) {
			for (int i = posicao; i < quantidade; i++) {
				arranjo[i] = arranjo[i+1];
			}
			quantidade--;
		}
	}
	
	public int tamanho() {
		return quantidade;
	}
	
	public void limpa() {
		for (int i = 0; i < quantidade; i++) {
			arranjo[i] = null;
		}
		quantidade = 0;
	}
	
	public int buscaPrimeira(T elemento) {
		for (int i = 0; i < quantidade; i++) {
			if (elemento.equals(arranjo[i])) {
				return i;
			}
		}
		return -1;
	}

	public int buscaUltima(T elemento) {
		int posicao = -1;
		for (int i = 0; i < quantidade; i++) {
			if (elemento.equals(arranjo[i])) {
				posicao = i;
			}
		}
		return posicao;
	}

	public void remove(T elemento) {
		for (int i = 0; i < quantidade; i++) {
			if (elemento.equals(arranjo[i])) {
				remove(i);
			}
		}
	}
	
	public void copia(Lista<T> lista) {
		for (int i = 0; i < lista.tamanho(); i++) {
			adiciona(lista.pega(i));
		}
	}

	public boolean igual(Lista<T> lista) {
		if (quantidade != lista.tamanho()) {
			return false;
		}
		for (int i = 0; i < quantidade; i++) {
			if (pega(i).equals(lista.pega(i)) == false) {
				return false;
			}
		}
		return true;
	}
	
	public void garanteEspaco() {
		if (quantidade == arranjo.length) {
			Object[] novoArranjo = new Object[quantidade*2];
			for (int i = 0; i < arranjo.length; i++) {
				novoArranjo[i] = arranjo[i];
			}
			arranjo = novoArranjo;
		}
	}
	
	public String toString() {
		String retorno = "";
		for (int i = 0; i < quantidade; i++) {
			if (i>0) {
				retorno += " / ";
			}
			if(arranjo[i] instanceof Aluno) {
				Aluno aluno = (Aluno) arranjo[i];
				retorno +=aluno.getMatricula() + "-" + aluno.getNome();
			}
		}
		return retorno;
	}
}