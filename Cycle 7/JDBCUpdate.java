import java.sql.*;

public class JDBCUpdate {
   static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
   static final String USERNAME = "system";
   static final String PASSWORD = "mca";

   public static void main(String[] args) {
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       try {
            
           Class.forName("oracle.jdbc.driver.OracleDriver");

           connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

           String updateQuery = "UPDATE Emp SET esal = ? WHERE ename = ?";

           preparedStatement = connection.prepareStatement(updateQuery);

           preparedStatement.setDouble(1, 15000);  
           preparedStatement.setString(2, "Rani");  

           int rowsUpdated = preparedStatement.executeUpdate();
           if (rowsUpdated > 0) {
               System.out.println("Record updated successfully.");
           } else {
               System.out.println("No record found for Rani.");
           }

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               if (preparedStatement != null) preparedStatement.close();
               if (connection != null) connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }
}
