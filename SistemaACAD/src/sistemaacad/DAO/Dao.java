package sistemaacad.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	public static String status = "Não conectou...";
	private final static String serverName = "localhost";
	private final static String mydatabase = "mysql";
	private final static String  username = "root";
	private final static  String  password = "123456";

	public Dao() {

	}

	public static Connection getConnection() {

		Connection connection = null;

		try {

			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->Não foi possivel realizar conexão");
			}
			return connection;

		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}
	public static String statusConection() {
		return status;
	}

	public static boolean FecharConexao() {
		try {
			Dao.getConnection().close();
			return true;

		} catch (SQLException e) {
			return false;
		}
	}

	public static java.sql.Connection ReiniciarConexao() {
		FecharConexao();
		return Dao.getConnection();

	}
}
