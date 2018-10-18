package orientacaoaobjetos;

public class Telefonista extends Funcionario {

	private int codigoEstacaoTrabalho;

	public int getCodigoEstacaoTrabalho() {
		return codigoEstacaoTrabalho;
	}

	public void setCodigoEstacaoTrabalho(int codigoEstacaoTrabalho) {
		this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;
	}
	
	@Override
	public String consultarDados() {
		return super.consultarDados()+
				"\nCódigo da Estação de trabalho: "+this.codigoEstacaoTrabalho;
	}

}
