import java.sql.*;
class JDBCWarning {

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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ErroringTable");

            SQLWarning warning = statement.getWarnings();
            if (warning != null) {
                System.out.println("SQLWarning detected:");
                while (warning != null) {
                    System.out.println("Message: " + warning.getMessage());
                    System.out.println("SQLState: " + warning.getSQLState());
                    System.out.println("Vendor Error Code: " + warning.getErrorCode());
                    warning = warning.getNextWarning();
                }
            } else {
                System.out.println("No SQLWarning detected.");
            }

        } catch (SQLException e) {
            System.err.println("SQLException occurred:");
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Vendor Error Code: " + e.getErrorCode());
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
         finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
