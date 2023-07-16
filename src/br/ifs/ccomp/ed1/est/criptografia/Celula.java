package est.criptografia;

public class Celula {
	
	private Object elemento;
	
	private Celula proxima;
	
	private Celula anterior;
	
	public Celula(Object elemento, Celula proxima, Celula anterior) {
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
	}
	
	public Celula(Object elemento, Celula proxima) {
		this.elemento = elemento;
		this.proxima = proxima;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}
	
	public Object getElemento() {
		return elemento;
	}
	
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	public Celula getProxima() {
		return proxima;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
}