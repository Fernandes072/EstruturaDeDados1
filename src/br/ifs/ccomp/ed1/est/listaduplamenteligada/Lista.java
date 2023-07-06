package est.listaduplamenteligada;

public interface Lista {
	
	public void adiciona(Object elemento);
	public void adiciona(Object elemento, int posicao);
	public Object pega(int posicao);
	public int busca(Object elemento);
	public void remove(int posicao);
	public int tamanho();
	
	public void limpa();
	public void substitui(int posicao, Object elemento);
	public void inverte();
	
	public void removeTodos(Object chave);
	public void copia(Lista lista);
	public boolean igual(Lista lista);
	public Lista segmento(int inicio, int fim);
	
	public boolean contem(Object elemento);
}