package lista3.classesinterna;

public enum TipoLampada {

	INCANDESCENTE(1),
	FLUORESCENTE(2);

	private int tipo;
	
	private TipoLampada(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
}
