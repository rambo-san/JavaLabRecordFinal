import java.sql.*;
// Import Oracle JDBC extensions
import oracle.jdbc.OracleTypes;

public class EmployeeData {
    public static void main(String[] args) {
        // Database URL and credentials
        String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl"; // Adjust the URL as needed
        String username = "system";
        String password = "mca";

        // SQL to call the stored procedure
        String callSQL = "{ call GET_ALL_EMPLOYEES(?) }";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             CallableStatement callableStatement = conn.prepareCall(callSQL)) {

            // Register OUT parameter as Oracle CURSOR type
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);

            // Execute the call
            callableStatement.execute();

            // Retrieve the result set
            try (ResultSet rs = (ResultSet) callableStatement.getObject(1)) {
                // Process the result set
                while (rs.next()) {
                    String ename = rs.getString("Ename");
                    BigDecimal esal = rs.getBigDecimal("Esal");
                    System.out.println("Employee Name: " + ename + ", Salary: " + esal);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
