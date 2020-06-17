package sistemaacad.DAO;

import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public  class  DBConnectionOrmLiteConnectionSource {
	
	public static  String ConnectionString= "URL";
	
	public static ConnectionSource getConnectionSource() {
	
		ConnectionSource conn = null;
	      try {
	    	        conn = new JdbcConnectionSource(ConnectionString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
