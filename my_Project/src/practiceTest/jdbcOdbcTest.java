package practiceTest;

/*
 * 4 types of Driver:
 * 1 Layer Driver -> JDBC/ODBC(Open database connectivity) >>  Best for Testing
 * 2 Layer Driver -> Native-API Based Driver
 * 3 Layer Driver -> Network Protocol Driver
 * 4 Layer Driver -> Thin Driver
 * 
 * 
 *  >> Some Popular Interface:
 *     1. Statement Interface
 *     2. Driver Interface
 *     3. Connection Interface
 *     4. Prepared Statement Interface
 *     5. ResultSet Interface
 *     6. DatabaseMetadata Interface
 *     7. RowSet Interface
 *     
 *  >> Some Classes:
 *     1. DriverManager Class
 *     2. Clob Class
 *     3. Blob Class
 *     4. Types Class 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcOdbcTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String jdbcConnection = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");
		// DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
		// Connection Interface and DriverManager Class
		Connection connectss = DriverManager.getConnection(jdbcConnection, username, password);

		Statement stse = connectss.createStatement();

		String querySQL = "select * from emp_details order by empID asc;";
		ResultSet outputResult = stse.executeQuery(querySQL);

		// Iterating
		while (outputResult.next()) {
			// empID
			int employeeID = outputResult.getInt("empID");

			// Emplyee Name
			String employeeName = outputResult.getString("Name");

			// Salary
			Double salarytest = outputResult.getDouble("Salary");
			
			
			System.out.println(employeeID + " " + employeeName+" "+salarytest);

			System.out.println(employeeName.contains("Scott"));

		}
		connectss.close();
		
		
//		System.out.println(Class.class.getPackageName());
	}

}
