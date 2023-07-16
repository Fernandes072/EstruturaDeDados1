package est.criptografia;

public class FilaArranjo implements Fila {

	private Object[] arranjo = new Object[100];
	
	private int quantidade;
	
	public void adiciona(Object elemento) {
		garanteEspaco();
		arranjo[quantidade] = elemento;
		quantidade++;
	}

	public Object remove() {
		if (!vazia()) {
			Object resultado  = arranjo[0];
			for(int i = 0; i < quantidade; i++) {
				arranjo[i] = arranjo[i+1];
			}
			quantidade--;
			return resultado;
		}
		return null;
	}

	public Object consulta() {
		if (!vazia()) {
			return arranjo[0];
			
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
		quantidade = 0;
	}
	

	public Fila removeLote(int qtd) {
		if (qtd > 0 && qtd <= quantidade) {
			Fila novaFila = new FilaArranjo();
			for (int i = 0; i < qtd; i++) {
				novaFila.adiciona(remove());
			}
			return novaFila;
		}
		return null;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < quantidade; i++) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(arranjo[i]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	private void garanteEspaco() {
		if (quantidade == arranjo.length) {
			Object[] novoArranjo = new Object[quantidade * 2];
			for (int i = 0; i < quantidade; i++) {
				novoArranjo[i] = arranjo[i];
			}
			arranjo = novoArranjo;
		}
	}
}
