/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe é responsável pelos atributos da Agência
 * 
 * @author Noturno
 *
 */
public class Agencia {

	/**
	 * Este é o atributo responsável pelo número da Agência.
	 */
	private String numero;

	/**
	 * Este é o construtor da classe.
	 * 
	 * @param numero este parâmetro é responsável pelo número da Agência.
	 */
	public Agencia(String numero) {
		//aqui faz a atribuição de número da Agência
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
