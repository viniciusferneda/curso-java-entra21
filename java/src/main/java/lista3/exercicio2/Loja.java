package lista3.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loja {

	public static void main(String[] args) {
		Livro livro = new Livro("O Hobbit", 50d, "J. R. R. Tolkien", "000000000111");
		Livro livro2 = new Livro("O Alquimista", 30d, "Paulo Coelho", "000000000112");
		
		CD cd = new CD("Thriller", 35d, 9, "000000000113");
		CD cd2 = new CD("Back In Black", 60d, 10, "000000000114");
		
		DVD dvd = new DVD("Avatar", 100d, 9720l, "000000000115");
		
		List<Produto> lProdutos = new ArrayList<>();
		lProdutos.add(livro);
		lProdutos.add(livro2);
		lProdutos.add(cd);
		lProdutos.add(cd2);
		lProdutos.add(dvd);
		
		System.out.println("*********Lista dos produtos cadastrados**********");
		
		for (Produto produto : lProdutos) {
			System.out.println(produto.toString());
		}
		
		System.out.println();
		
		System.out.println("**********Resultado da busca do cd Thriller*************");
		buscaProdutos(cd, lProdutos);
		
		DVD dvd2 = new DVD("Avatar", 100d, 9720l, "000000000115");
		DVD dvd3 = new DVD("Avatar 2", 100d, 9720l, "000000000116");
		
		System.out.println();
		
		System.out.println("**********Resultado da busca do DVD Avatar************");
		buscaProdutos(dvd2, lProdutos);
		
		System.out.println();
		
		System.out.println("*********Resultado da busca do DVD Avatar 2************");
		buscaProdutos(dvd3, lProdutos);
		
		Collections.sort(lProdutos);
		
		System.out.println();
		
		System.out.println("********Lista dos produtos cadastrados ordenados************");
		for (Produto produto : lProdutos) {
			System.out.println(produto.toString());
		}
	}

	private static void buscaProdutos(Produto produto, List<Produto> lProdutos) {
		for (Produto prod : lProdutos) {
			if(prod.equals(produto)){
				System.out.println("O produto "+prod.getNome()+ " se encontra na posição "+lProdutos.indexOf(prod));
				return;
			}
		}
		System.out.println("O produto "+produto.getNome()+ " não foi encontrado.");
	}

}

