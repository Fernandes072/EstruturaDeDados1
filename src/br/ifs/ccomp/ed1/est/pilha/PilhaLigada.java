package est.pilha;

public class PilhaLigada implements Pilha {
	
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
		if (quantidade > 0) {
			Celula celula = fim;
			if (quantidade == 1) {
				inicio = null;
				fim = null;
			} else {
				Celula anterior = celula.getAnterior();
				anterior.setProxima(null);
				fim = anterior;
			}
			quantidade--;
			return celula.getElemento();
		}
		return null;
	}

	public Object topo() {
		if (quantidade > 0) {
			return fim.getElemento();
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
