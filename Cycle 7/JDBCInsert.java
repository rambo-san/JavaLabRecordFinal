import java.sql.*;
class JDBCInsert {
	static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String USERNAME = "system";
	static final String PASSWORD = "mca";
 
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
			connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
 
			statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Department VALUES (1, 'Civil', 'Kochi')");
			statement.executeUpdate("INSERT INTO Department VALUES (2, 'Accounts', 'Delhi')");
			System.out.println("Records inserted into Department table.");
 
			statement.executeUpdate("INSERT INTO Emp VALUES (101, 'Chetan', 10000, 1)");
			statement.executeUpdate("INSERT INTO Emp VALUES (102, 'Amish', 20000, 2)");
			statement.executeUpdate("INSERT INTO Emp VALUES (103, 'Rani', 15000, 1)");
			statement.executeUpdate("INSERT INTO Emp VALUES (104, 'Rahul', 5000, 2)");
			System.out.println("Records inserted into Emp table.");
 
			String query = "SELECT e.eno, e.ename, e.esal, d.dname, d.dloc " +
						   "FROM Emp e INNER JOIN Department d ON e.dno = d.dno";
			ResultSet resultSet = statement.executeQuery(query);
 
			System.out.println("eno\tename\tesal\t  dname\t\t  dloc");
			while (resultSet.next()) {
				int eno = resultSet.getInt("eno");
				String ename = resultSet.getString("ename");
				double esal = resultSet.getDouble("esal");
				String dname = resultSet.getString("dname");
				String dloc = resultSet.getString("dloc");
				 
				System.out.println(eno + "\t"+ ename + "\t"+ esal + "\t" + dname + "\t"+ dloc);
			}
 
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 }
 