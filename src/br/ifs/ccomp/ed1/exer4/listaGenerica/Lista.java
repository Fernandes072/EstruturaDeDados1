package br.ifs.ccomp.ed1.exer4.listaGenerica;

public interface Lista<T> {
	
	public void adiciona(T elemento);
	public void adicionaLinear(T elemento);
	public void adiciona(int posicao, T elemento);
	public T pega(int posicao);
	public void remove(int posicao);
	public int tamanho();
	public void Limpar();
}