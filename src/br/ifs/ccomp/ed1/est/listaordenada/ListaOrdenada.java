package est.listaordenada;

public class ListaOrdenada implements Lista {
	
	private Object[] arranjo = new Object[100];
	
	private int quantidade;

	public void adiciona(Object elemento) {
		Comparable obj = (Comparable) elemento;
		garanteEspaco();
		boolean adicionou = false;
		for (int i = quantidade-1; i >= 0; i--) {
			arranjo[i+1] = arranjo[i];
			if (obj.compareTo(arranjo[i]) > 0) {
				arranjo[i+1] = obj;
				adicionou = true;
				break;
			}
			if (i == 0) {
				arranjo[i] = obj;
				adicionou = true;
			}
		}
		if (!adicionou) {
			arranjo[quantidade] = obj;
		}
		quantidade++;
	}
	
	//Esse método adiciona na ordem decrescente
	/*public void adiciona(Object elemento) {
		Comparable obj = (Comparable) elemento;
		garanteEspaco();
		for (int i = quantidade; i >= 0; i--) {
			System.out.println(i-1);
			if (i == 0) {
				arranjo[quantidade] = obj;
				break;
			} else if (obj.compareTo(arranjo[i-1]) == 1) {
				arranjo[i] = arranjo[i-1];
				arranjo[i-1] = obj;
				break;
			}
		}
		quantidade++;
	}*/

	public void adiciona(Object elemento, int posicao) {
		adiciona(elemento);
	}

	public Object pega(int posicao) {
		if (posicao <= quantidade && posicao >= 0) {
			return arranjo[posicao];
		}
		return null;
	}
	
	//Esse retorna o último objeto igual
	public int busca(Object elemento) {
		int posicao = -1;
		Comparable obj = (Comparable) elemento;
		for (int i = 0; i < quantidade; i++) {
			if (obj.compareTo(arranjo[i]) == 0) {
				posicao = i;
			}
		}
		return posicao;
	}
	
	public int buscaOrdenada(Object elemento) {
		Comparable obj = (Comparable) elemento;
		for (int i = 0; i < quantidade; i++) {
			if (obj.compareTo(arranjo[i]) == 0) {
				return i;
			} else if(obj.compareTo(arranjo[i]) == -1){
				break;
			}
		}
		return -1;
	}
	
	public int buscaBinaria(Object elemento) {
		int esq = 0;
		int dir = quantidade - 1;
		Comparable obj = (Comparable) elemento;
		while(esq <= dir) {
			int meio = (int) (esq+dir)/2;
			if(obj.compareTo(arranjo[meio]) == 0) {
				return meio;
			} else if(obj.compareTo(arranjo[meio]) == -1) {
				dir = meio - 1;
			} else {
				esq = meio + 1;
			}
		}
		return -1;
	}
	
	//Esse retorna o primeiro objeto igual
	public int buscaPrimeiro(Object elemento) {
		Comparable obj = (Comparable) elemento;
		for (int i = 0; i < quantidade; i++) {
			if (obj.compareTo(arranjo[i]) == 0) {
				return i;
			}
		}
		return -1;
	}

	public void remove(int posicao) {
		if (posicao <= quantidade && posicao >= 0) {
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
	}
	
	//esse substitui exatamente na posição
	public void substitui(int posicao, Object elemento) {
		if(posicao < quantidade && posicao >= 0) {
			arranjo[posicao] = elemento;
		}
	}
	
	//esse exclui o elemento e coloca o novo na ordem
	/*public void substitui(int posicao, Object elemento) {
		if(posicao < quantidade && posicao >= 0) {
			remove(posicao);
			adiciona(elemento);
		}
	}*/
	
	public void inverte() {
		int j = quantidade - 1;
		for (int i = 0; i < (quantidade-1)/2; i++) {
			Object copia = arranjo[j];
			arranjo[j] = arranjo[i];
			arranjo[i] = copia;
			j--;
		}
	}

	public void removeTodos(Object chave) {
		Aluno aluno = (Aluno) chave;
		for (int i = 0; i < quantidade; i++) {
			if (aluno.equals(arranjo[i])) {
				remove(i);
			}
		}
	}
	
	
	public void removePrimeiro(Object chave) {
		Aluno aluno = (Aluno) chave;
		for (int i = 0; i < quantidade; i++) {
			if (aluno.equals(arranjo[i])) {
				remove(i);
				break;
			}
		}
	}
	
	public void removeUltimo(Object chave) {
		Aluno aluno = (Aluno) chave;
		int posicao = -1;
		for (int i = 0; i < quantidade; i++) {
			if (aluno.equals(arranjo[i])) {
				posicao = i;
			}
		}
		remove(posicao);
	}

	public void copia(Object[] narranjo) {
		for (int i = 0; i < narranjo.length; i++) {
			adiciona(narranjo[i]);
		}
	}

	public boolean igual(Lista lista) {
		boolean resultado = true;
		if (lista.tamanho() == tamanho()) {
			for (int i = 0; i < quantidade; i++) {
				if (!arranjo[i].equals(lista.pega(i))) {
					return false;
				}
			}
		} else {
			resultado = false;
		}
		return resultado;
	}

	public Lista segmento(int inicio, int fim) {
		if (inicio >= 0 && fim >= inicio && fim < quantidade) {
			Lista listaParte = new ListaOrdenada();
			for (int i = inicio; i < fim; i++) {
				System.out.println(arranjo[i]);
				listaParte.adiciona(arranjo[i]);
			}
			return listaParte;
		}
		return null;
	}

	@Override
	public boolean contem(Object elemento) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < quantidade; i++) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(arranjo[i].toString());
		}
		sb.append("]");
		return sb.toString();
	}
	
	private void garanteEspaco() {
		if (quantidade == arranjo.length) {
			Object[] novoArranjo = new Object[arranjo.length * 2];
			for (int i = 0; i < quantidade; i++) {
				novoArranjo[i] = arranjo[i];
			}
			arranjo = novoArranjo;
		}
	}
}
