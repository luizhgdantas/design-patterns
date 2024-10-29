
public class UnidadeMilitar {
	private Estrategia estrategia;
	
	public UnidadeMilitar() {
		
	}
	
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void executarEstrategia() {
		estrategia.executarEstrategia();
	}
}
