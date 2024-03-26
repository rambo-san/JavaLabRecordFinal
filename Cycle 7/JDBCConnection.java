import java.sql.*;

class JDBCConnection {
   private String jdbcUrl;
   private String username;
   private String password;
   private Connection connection;

   public JDBCConnection(String jdbcUrl, String username, String password) {
       this.jdbcUrl = jdbcUrl;
       this.username = username;
       this.password = password;
   }

   public void connect() {
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");

           connection = DriverManager.getConnection(jdbcUrl, username, password);
           System.out.println("Connected to the database.");
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public void close() {
       try {
           if (connection != null) {
               connection.close();
               System.out.println("Database connection closed.");
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   public static void main(String[] args) {
       JDBCConnection dbConnection = new JDBCConnection("jdbc:oracle:thin:@localhost:1521:orcl",
               "system", "mca");
       dbConnection.connect();
       dbConnection.close();
   }
}
