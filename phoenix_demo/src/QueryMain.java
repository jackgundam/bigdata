import java.sql.Connection;
import java.sql.DriverManager;

public class QueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
			Connection connection = DriverManager.getConnection("jdbc:phoenix:");
			System.out.println("got connection: "+connection.toString());
			
			//Q1task q1task = new Q1task(connection);
			//q1task.executeQuery();
			//Q2task q2task = new Q2task(connection);
			//q2task.executeQuery();
			Q3task q3task = new Q3task(connection);
			q3task.executeQuery();
			
			connection.close();
			System.out.println("closed connection");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
