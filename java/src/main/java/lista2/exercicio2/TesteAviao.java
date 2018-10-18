package lista2.exercicio2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class TesteAviao {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		try {

			Boing boing = new Boing(100);
			Boing boing2 = new Boing(120);
			List<Boing> lBoings = Arrays.asList(boing, boing2);

			Monomotor monomotor = new Monomotor(15);
			Monomotor monomotor2 = new Monomotor(18);
			Monomotor monomotor3 = new Monomotor(30);
			List<Monomotor> lMonomotors = Arrays.asList(monomotor, monomotor2, monomotor3);

			Bimotor bimotor = new Bimotor(10);
			Bimotor bimotor2 = new Bimotor(12);
			List<Bimotor> lBimotors = Arrays.asList(bimotor, bimotor2);

			CompanhiaArea companhiaArea = new CompanhiaArea();
			companhiaArea.setBoings(lBoings);
			companhiaArea.setMonomotores(lMonomotors);
			companhiaArea.setBimotores(lBimotors);

			System.out.println("O valor de faturamento da companhia aérea é de R$ "
					+ df.format(companhiaArea.retornaFaturamentoPassagens()));

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
