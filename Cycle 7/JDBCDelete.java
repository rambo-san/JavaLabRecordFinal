import java.sql.*;

public class JDBCDelete {
   static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
   static final String USERNAME = "SYSTEM";
   static final String PASSWORD = "mca";

   public static void main(String[] args) {
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
           String deleteQuery = "DELETE FROM Emp WHERE esal < ?";

           preparedStatement = connection.prepareStatement(deleteQuery);
           preparedStatement.setDouble(1, 10000);  
           int rowsDeleted = preparedStatement.executeUpdate();
           System.out.println(rowsDeleted + " records deleted successfully.");

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
