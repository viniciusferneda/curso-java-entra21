package collectionsJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		List lista = new ArrayList<>();
		
		lista.add("String");
		lista.add(10);
		lista.add(15);
		lista.add("lista");
		lista.add(5.5);
		
		for (Object object : lista) {
			System.out.println(object);
		}
		
		List<String> lString = new ArrayList<>();
		lString.add("String");
		lString.add("String");
		lString.add("String");
		
		for (String string : lString) {
			System.out.println(string);
		}
		
		Set<String> setString = new HashSet<>();
		setString.add("String2");
		setString.add("String2");
		setString.add("String2");
		
		for (String string : setString) {
			System.out.println(string);
		}
		
	}
}
