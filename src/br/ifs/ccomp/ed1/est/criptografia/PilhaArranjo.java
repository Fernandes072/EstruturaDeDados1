package est.criptografia;

public class PilhaArranjo implements Pilha {
	
	private int quantidade = 0;
	
	private Object[] arranjo = new Object[100];

	public void adiciona(Object elemento) {
		garanteEspaco();
		arranjo[quantidade] = elemento;
		quantidade++;
	}

	public Object remove() {
		if (!vazia()) {
			Object resultado = arranjo[quantidade-1];
			arranjo[quantidade-1] = null;
			quantidade--;
			return resultado;
		}
		return null;
	}

	public Object topo() {
		if (!vazia()) {
			return arranjo[quantidade-1];
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
		for (int i = 0; i < quantidade; i++) {
			arranjo[i] = null;
		}
		quantidade = 0;
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
