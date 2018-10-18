package lista3.classesinterna;

public class FabricaLampada {

	private ILampada lampada;

	public void ligar() {
		this.lampada.ligar();
	}

	public void desligar() {
		this.lampada.desligar();
	}

	public void construir(int tipo) {
		if (tipo == TipoLampada.INCANDESCENTE.getTipo()) {
			// Criação de uma classe anonima
			this.lampada = new ILampada() {
				@Override
				public void ligar() {
					System.out.println("Ligou Lampada Incandescente");
				}

				@Override
				public void desligar() {
					System.out.println("Desligou Lampada Incandescente");
				}
			};
			// Criação de uma classe interna Aninhada
		} else if (tipo == TipoLampada.FLUORESCENTE.getTipo()) {
			this.lampada = new Fluorescente();
		}
	}

	private static class Fluorescente implements ILampada {
		@Override
		public void ligar() {
			System.out.println("Ligou Lampada Fluorescente");
		}

		@Override
		public void desligar() {
			System.out.println("Desligou Lampada Fluorescente");
		}

	}

}
