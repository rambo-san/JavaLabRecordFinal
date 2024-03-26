import java.sql.*;

class JDBCList {
   static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
   static final String USERNAME = "SYSTEM";
   static final String PASSWORD = "mca";

   public static void main(String[] args) {
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       ResultSet resultSet = null;
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
           String selectQuery = "SELECT * FROM Emp WHERE ename LIKE ?";
           preparedStatement = connection.prepareStatement(selectQuery);
           preparedStatement.setString(1, "R%");  

           resultSet = preparedStatement.executeQuery();

           System.out.println("eno\tename\tesal\tdno");
           while (resultSet.next()) {
               int eno = resultSet.getInt("eno");
               String ename = resultSet.getString("ename");
               double esal = resultSet.getDouble("esal");
               int dno = resultSet.getInt("dno");
               System.out.println(eno + "\t" + ename + "\t" + esal + "\t" + dno);
           }

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               if (resultSet != null) resultSet.close();
               if (preparedStatement != null) preparedStatement.close();
               if (connection != null) connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }
}
