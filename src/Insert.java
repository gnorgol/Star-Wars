import java.sql.*;

public class Insert {

	public static void main(String[] arg) {
		
		try {
			String strClassName = "com.mysql.jdbc.Driver";
			String dbName= "starwars"; 
			String login= "root"; 
			String motdepasse= ""; 
			String strUrl = "jdbc:mysql://localhost:3306/" +  dbName+"?autoReconnect=true&useSSL=false";
			
			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			Statement stLogin = conn.createStatement();
			String strQuery = "SELECT * FROM film;";  
			ResultSet rsUsers = stLogin.executeQuery(strQuery);
			while(rsUsers.next()) {
				System.out.println(rsUsers.getString(2));
			}
			
			conn.close();
			
		}
		catch(ClassNotFoundException e) {  

			System.err.println("Driver non chargé !");  e.printStackTrace();

		}
		catch(SQLException e) {
			
			}

		
		
	}
	
	
	
}
