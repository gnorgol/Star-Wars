import java.sql.*;
import java.util.Scanner;
public class Select {
	
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
				System.out.println("Id : "+ rsUsers.getInt(1)+" Titre : "+ rsUsers.getString(2)+" Date de sortie : "+ rsUsers.getInt(3)+" Numéro : "+ rsUsers.getString(4)+" coût : "+ rsUsers.getInt(5)+" recette : "+ rsUsers.getInt(6));
			}
			
			
			Scanner sc = new Scanner(System.in);
			
			
			//Supprimer un film par sont id
			/*System.out.println("Vous voulez supprimez quelle film ? (id) : ");
			String id = sc.nextLine();
			String deleteQuery = "DELETE FROM film where id = "+id+";"; 
			System.out.println(deleteQuery);
			stLogin.executeUpdate(deleteQuery);*/
			
			System.out.println("Vous voulez update quelle film (id) : ");
			String id = sc.nextLine();
			System.out.println("Quelle est sont nouveau Titre : ");
			String UpdateTitre = sc.nextLine();
			String updateQuery = "Update film set Titre = '"+UpdateTitre+"' where id = "+id+";"; 
			stLogin.executeUpdate(updateQuery);
			
			conn.close();
		}
		catch(ClassNotFoundException e) {  

			System.err.println("Driver non chargé !");  e.printStackTrace();

		}
		catch(SQLException e) {
			
			}
	}
	
	
}


