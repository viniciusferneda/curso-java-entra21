package br.com.vinicius.jdbc.hsqldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoAula3 {

	public static void main(String[] args) throws SQLException {
		ConnectionPool database = new ConnectionPool();
		Connection connection = database.getConnection();
		
		String nome = "Notebook";
		String descricao = "Notebook 'i7 7ª geração";
		
		String sql = "insert into Produto (nome, descricao) values(?, ?)";
		
		PreparedStatement ps = connection.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, nome);
		ps.setString(2, descricao);
        
        boolean resultado = ps.execute();
        
        ps.close();
		connection.close();	
	}
}
