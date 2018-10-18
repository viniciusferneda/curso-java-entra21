package orientacaoaobjetos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");

	public void registraEntrada(Funcionario funcionario) {
		Date agora = new Date();
		System.out.println("ENTRADA : " + funcionario.getNome());
		System.out.println("DATA : " + sdf.format(agora));
	}

	public void registraSaida(Funcionario funcionario) {
		Date agora = new Date();
		System.out.println("SAÍDA : " + funcionario.getNome());
		System.out.println("DATA : " + sdf.format(agora));
	}

}
