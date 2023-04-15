package br.ifs.ccomp.ed1.exer4.listaGenericaTeste;

public class Professor extends Pessoa{
	
	private int cargaHoraria;
	
	public Professor() {
		
	}
	
	public Professor(String nome, int cargaHoraria) {
		super(nome);
		setCargaHoraria(cargaHoraria);
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString() {
		return getCargaHoraria()+"-"+super.toString();
	}
}