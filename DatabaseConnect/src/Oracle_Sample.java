//import java.sql.*;
//
//public class Oracle_Sample {
//
//        public static final String DBURL = "jdbc:oracle:thin:@194.163.169.38:1521";
//
//        public static final String DBUSER = "system";
//
//        public static final String DBPASS = "maneger";
//
//
//
//        public static void main(String[] args) throws SQLException {
//
//
//
//            // Load Oracle JDBC Driver
//
//            DriverManager.registerDriver(new Oracle.jdbc.driver.OracleDriver());
//
//
//
//            // Connect to Oracle Database
//
//            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
//
//
//
//            Statement statement = con.createStatement();
//
//
//
//            // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values
//
//            // Enables us to retrieve values as if querying from a table
//
//            ResultSet rs = statement.executeQuery("SELECT SYSDATE FROM DUAL");
//
//
//
//
//
//            if (rs.next()) {
//
//                Date currentDate = rs.getDate(1); // get first column returned
//
//                System.out.println("Current Date from Oracle is : "+currentDate);
//
//            }
//
//            rs.close();
//
//            statement.close();
//
//            con.close();
//
//        }
//
//
//}
