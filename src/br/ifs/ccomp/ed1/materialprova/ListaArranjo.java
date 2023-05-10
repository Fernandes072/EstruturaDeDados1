package br.ifs.ccomp.ed1.materialprova;

public class ListaArranjo<T> implements Lista<T> {
	
	private Object[] arranjo = new Object[100];
	
	private int quantidade = 0;

	public void adiciona(T elemento) {
		garanteEspaco();
		arranjo[quantidade] = elemento;
		quantidade++;
	}

	public void adiciona(int posicao, T elemento) {
		garanteEspaco();
		if (posicao < quantidade) {
			for (int i = quantidade; i > posicao; i--) {
				arranjo[i] = arranjo[i-1];
			}
		}
		arranjo[posicao] = elemento;
		quantidade++;
	}

	@Override
	public T pega(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void garanteEspaco() {
		if (quantidade == arranjo.length) {
			Object[] novoArranjo = new Object[quantidade*2];
			for (int i = 0; i < arranjo.length; i++) {
				novoArranjo[i] = arranjo[i];
			}
			arranjo = novoArranjo;
		}
	}
	
	public String toString() {
		String retorno = "";
		for (int i = 0; i < quantidade; i++) {
			if (i>0) {
				retorno += " / ";
			}
			if(arranjo[i] instanceof Aluno) {
				Aluno aluno = (Aluno) arranjo[i];
				retorno +=aluno.getMatricula() + "-" + aluno.getNome();
			}
		}
		return retorno;
	}
}