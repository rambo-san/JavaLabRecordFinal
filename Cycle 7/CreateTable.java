import java.sql.*;

public class CreateTable {
   static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
   static final String USERNAME = "system";
   static final String PASSWORD = "mca";

   public static void main(String[] args) {
       Connection connection = null;
       Statement statement = null;
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
           System.out.println("Connected to the database.");

           statement = connection.createStatement();
           String createDepartmentTableSQL =
                   "CREATE TABLE Department ( dno INT PRIMARY KEY, dname VARCHAR(50), dloc VARCHAR(50))";
           statement.executeUpdate(createDepartmentTableSQL);
           System.out.println("Department table created successfully.");
           String createEmpTableSQL =
                   "CREATE TABLE Emp (eno INT PRIMARY KEY, ename VARCHAR(50), esal DECIMAL(10, 2), dno INT, CONSTRAINT fk_department FOREIGN KEY (dno) REFERENCES Department(dno))";
           statement.executeUpdate(createEmpTableSQL);
           System.out.println("Emp table created successfully.");
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               if (statement != null) statement.close();
               if (connection != null) connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }
}
