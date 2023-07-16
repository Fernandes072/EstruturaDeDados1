package est.criptografia;

public interface Fila {
	public void adiciona(Object elemento);
	public Object remove();
	public Object consulta();
	public int tamanho();
	public boolean vazia();
	public void limpa();
	public Fila removeLote(int qtd);
}