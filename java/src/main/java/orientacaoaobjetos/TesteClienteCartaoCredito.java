package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartaoCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("João");
		
		CartaoCredito cartaoCredito = new CartaoCredito("123456");
		cartaoCredito.setDataValidade(sdf.parse("01/01/2025"));
		
		//vincular o cliente ao cartão de crédito
		cartaoCredito.setCliente(cliente);
		
		System.out.println("O cliente "+ cartaoCredito.getCliente().getNome() +
				" com código "+ cartaoCredito.getCliente().getCodigo()+
				" possui o cartão de crédito "+ cartaoCredito.getNumero()+
				" com validade até "+sdf.format(cartaoCredito.getDataValidade()));
	}
}
