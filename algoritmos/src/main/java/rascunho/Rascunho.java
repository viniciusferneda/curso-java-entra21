package rascunho;

public class Rascunho {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Informe um texto:"); String texto =
		 * scanner.nextLine(); texto = texto.replace("a", "w").replace("e",
		 * "w"); System.out.println(texto); scanner.close();
		 */

		// System.out.println("01/02/1990".lastIndexOf("/"));

		/*
		 * boolean teste = true; boolean outroTeste = false;
		 * System.out.println(teste); System.out.println(outroTeste);
		 * 
		 * outroTeste = teste; System.out.println(teste);
		 * System.out.println(outroTeste);
		 * 
		 * teste = false; System.out.println(teste);
		 * System.out.println(outroTeste);
		 */

		/*
		 * String primeiroNome = "Vinícius"; String templateTexto =
		 * "Meu nome é %1$s. E de novo meu nome é %1$s";
		 * System.out.println(String.format(templateTexto, primeiroNome));
		 */
		
		/*for (int i = 0; i < args.length; i++) {
			if(args[i] != "C"){
				System.out.println(args[i]);
			}
		}*/
		
		int charVal = 800;
		char aChar  = (char)charVal;
		System.out.println(aChar);
		
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
	}
}
