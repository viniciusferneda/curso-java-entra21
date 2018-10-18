package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");

	public static void registraEntrada(Funcionario funcionario) {
		Date agora = new Date();
		System.out.println("ENTRADA : " + funcionario.getNome());
		System.out.println("DATA : " + sdf.format(agora));
	}

	public static void registraSaida(Funcionario funcionario) {
		Date agora = new Date();
		System.out.println("SAÍDA : " + funcionario.getNome());
		System.out.println("DATA : " + sdf.format(agora));
	}

}
