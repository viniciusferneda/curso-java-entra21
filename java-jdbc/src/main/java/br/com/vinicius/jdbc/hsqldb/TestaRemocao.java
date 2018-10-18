package br.com.vinicius.jdbc.hsqldb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionPool database = new ConnectionPool();
		Connection connection = database.getConnection();
		
		Statement stmt = connection.createStatement();
		stmt.execute("delete from Produto where id>3");

		// quantas linhas foram removidas?
		int count = stmt.getUpdateCount();
		System.out.println(count + " linhas atualizadas");

		stmt.close();
		connection.close();
	}

}
