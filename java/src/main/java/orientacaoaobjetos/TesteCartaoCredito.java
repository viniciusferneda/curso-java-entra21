package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartaoCredito {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		CartaoCredito cartaoCredito = new CartaoCredito("123456789");
		cartaoCredito.setDataValidade(sdf.parse("01/01/2020"));
		
		CartaoCredito cartaoCredito2 = new CartaoCredito("987654321");
		cartaoCredito2.setDataValidade(sdf.parse("01/03/2025"));
		
		System.out.println("Cartão 1: " + cartaoCredito.getNumero() +
				" com validade até "+
				sdf.format(cartaoCredito.getDataValidade()));
		System.out.println("Cartão 2: " + cartaoCredito2.getNumero() + 
				" com validade até "+
				sdf.format(cartaoCredito2.getDataValidade()));
		
	}
}
