package exercicio22;

import java.text.DecimalFormat;

public class FormadorValores {

	private static final DecimalFormat decimalFormat = new DecimalFormat("R$ #,##0.00");
	
	public static String formatarReais(Double valor) {
		return decimalFormat.format(valor);
	}
}
