package est.fila;

import est.pilha.Celula;

public class FilaLigada implements Fila {
	
	private Celula inicio;
	
	private Celula fim;
	
	private int quantidade;

	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento);
		if (quantidade == 0) {
			inicio = nova;
			fim = nova;
		} else {
			fim.setProxima(nova);
			nova.setAnterior(fim);
			fim = nova;
		}
		quantidade++;
	}

	public Object remove() {
		if (!vazia()) {
			Celula celula = inicio;
			inicio = inicio.getProxima();
			inicio.setAnterior(null);
			quantidade--;
			return celula.getElemento();
			
		}
		return null;
	}

	public Object consulta() {
		if (!vazia()) {
			return inicio.getElemento();
		}
		return null;
	}

	public int tamanho() {
		return quantidade;
	}

	public boolean vazia() {
		return quantidade == 0;
	}

	public void limpa() {
		inicio = null;
		fim = null;
		quantidade = 0;
	}

	public Fila removeLote(int qtd) {
		if (qtd > 0 && qtd <= quantidade) {
			Fila novaFila = new FilaLigada();
			for (int i = 0; i < qtd; i++) {
				novaFila.adiciona(remove());
			}
			return novaFila;
		}
		return null;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Celula celula = inicio;
		while(celula != null) {
			if (sb.length() >1 ) {
				sb.append(", ");
			}
			sb.append(celula.getElemento());
			celula = celula.getProxima();
		}
		sb.append("]");
		return sb.toString();
	}

}
