package est.listaduplamenteligada;

public class ListaDuplamenteLigada implements Lista {
	
	private Celula inicio;
	
	private Celula fim;
	
	private int quantidade;
	
	public void adicionaNoComeco(Object elemento) {
		Celula novaCelula = new Celula(elemento);
		//ou poderia ser if (inicio == null)
		if (quantidade == 0) {
			inicio = novaCelula;
			fim = novaCelula;
		} else {
			novaCelula.setProximo(inicio);
			inicio.setAnterior(novaCelula);
			inicio = novaCelula;
		}
		quantidade++;
	}

	public void adiciona(Object elemento) {
		if (quantidade == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula novaCelula = new Celula(elemento);
			novaCelula.setAnterior(fim);
			fim.setProximo(novaCelula);
			fim = novaCelula;
			quantidade++;
		}
	}

	public void adiciona(Object elemento, int posicao) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == quantidade) {
			adiciona(elemento);
		} else {
			Celula novaCelula = new Celula(elemento);
			Celula celula = pegaCelula(posicao);
			Celula anterior = celula.getAnterior();
			novaCelula.setProximo(celula);
			novaCelula.setAnterior(anterior);
			celula.setAnterior(novaCelula);
			anterior.setProximo(novaCelula);
			//mesma coisa só que de uma forma mais difícil
			/*novaCelula.setAnterior(celula.getAnterior());
			novaCelula.setProximo(celula);
			celula.setAnterior(novaCelula);
			novaCelula.getAnterior().setProximo(novaCelula);*/
			quantidade++;
			
		}
	}
	
	private Celula pegaCelula(int posicao) {
		Celula resultado = null;
		int tam = quantidade/2;
		if (posicao <= tam) {
			Celula celula = inicio;
			for (int i = 0; i <= posicao; i++) {
				resultado = celula;
				celula = celula.getProximo();
			}
		} else {
			Celula celula = fim;
			for (int i = quantidade; i > posicao; i--) {
				resultado = celula;
				celula = celula.getAnterior();
			}
		}
		return resultado;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return (posicao >= 0 && posicao < quantidade);
	}

	public Object pega(int posicao) {
		if (posicaoOcupada(posicao)) {
			return pegaCelula(posicao).getElemento();
		}
		return null;
	}
	
	//esse pega faz pegaCelula, posicaoOcupada e o pega juntos
	/*public Object pega(int posicao) {
		Object resultado = null;
		if (posicao >= 0 && posicao <= quantidade) {
			int tam = quantidade/2;
			if (posicao <= tam) {
				Celula celula = inicio;
				for (int i = 0; i <= posicao; i++) {
					resultado = celula.getElemento();
					celula = celula.getProximo();
				}
			} else {
				Celula celula = fim;
				for (int i = quantidade; i > posicao; i--) {
					resultado = celula.getElemento();
					celula = celula.getAnterior();
				}
			}
		}
		return resultado;
	}*/

	public int busca(Object elemento) {
		int posicao = 0;
		Celula celula = inicio;
		while (celula != null) {
			if (elemento.equals(celula.getElemento())) {
				return posicao;
			}
			celula = celula.getProximo();
			posicao++;
		}
		return -1;
	}

	public void remove(int posicao) {
		if (posicaoOcupada(posicao)) {
			if (quantidade == 1) {
				inicio = null;
				fim = null;
			} else if (posicao == 0) {
				inicio = inicio.getProximo();
				inicio.setAnterior(null);
			} else if (posicao == quantidade-1) {
				fim = fim.getAnterior();
				fim.setProximo(null);
			} else {
				Celula celula = pegaCelula(posicao);
				Celula proxima = celula.getProximo();
				Celula anterior = celula.getAnterior();
				anterior.setProximo(proxima);
				proxima.setAnterior(anterior);
			}
			quantidade--;
		}
	}

	public int tamanho() {
		return quantidade;
	}


	public void limpa() {
		inicio = null;
		fim = null;
		quantidade = 0;
	}

	@Override
	public void substitui(int posicao, Object elemento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inverte() {
		// TODO Auto-generated method stub

	}
	
	private int ocorrencias(Object chave) {
		int resultado = 0;
		Celula celula = inicio;
		while (celula != null) {
			if (chave.equals(celula.getElemento())) {
				resultado++;
			}
			celula = celula.getProximo();
		}
		return resultado;
	}

	public void removeTodos(Object chave) {
		int resultado = ocorrencias(chave);
		while (resultado > 1) {
			Celula celula = inicio;
			int posicao = 0;
			while (celula != null) {
				if (chave.equals(celula.getElemento())) {
					remove(posicao);
					resultado--;
					break;
				}
				celula = celula.getProximo();
				posicao++;
			}
		}
	}

	public void copia(Lista lista) {
		int i = 0;
		while (lista.pega(i) != null) {
			adiciona(lista.pega(i));
			i++;
		}
	}

	@Override
	public boolean igual(Lista lista) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Lista segmento(int inicio, int fim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contem(Object elemento) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Celula celula = inicio;
		while (celula != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(celula.getElemento().toString());
			celula = celula.getProximo();
		}
		sb.append("]");
		return sb.toString();
	}

}
