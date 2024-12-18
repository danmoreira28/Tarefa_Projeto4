package br.com.danilo.dao.generic.jdbc;

/**
 * @author danmoreira28
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	private static Connection connection;
	
	private ConnectionFactory(Connection connection) {
		
	}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = initConnection();
			return connection;
		} else if (connection.isClosed()) {
			connection = initConnection();
			return connection;
		} else {
			return connection;
		}
	}
	
	private static Connection initConnection() {
        try {
            return DriverManager.getConnection(
            		"jdbc:postgresql://45.165.60.46:5432/TarefaProjeto4", "postgres", "1nt3l1g3nt3");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
}
