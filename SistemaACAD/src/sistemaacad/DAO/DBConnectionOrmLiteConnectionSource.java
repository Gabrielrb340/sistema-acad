package sistemaacad.DAO;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public  class  DBConnectionOrmLiteConnectionSource {
	private final static  String ConnectionString= "jdbc:mysql://localhost:3306/lite";
	private final static  String User= "root";
	private final static  String Pass= "";
	private static ConnectionSource Conn = null;

	public static ConnectionSource getConnectionSource() {
	      try {
	    	  if(Conn!=null) {
	    		  return Conn;
	    	  }
	    	        Conn = new JdbcConnectionSource(ConnectionString,User,Pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Conn;
	}
	public static void closeConnection() {
		if(Conn!= null) {
			try {
				Conn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
