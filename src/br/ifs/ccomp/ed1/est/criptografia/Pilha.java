package est.criptografia;

public interface Pilha {
	public void adiciona(Object elemento);
	public Object remove();
	public Object topo();
	public int tamanho();
	public boolean vazia();
	public void limpa();
}