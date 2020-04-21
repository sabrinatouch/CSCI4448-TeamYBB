package net.sqlitetutorial;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */

public class Database {
    public Database() {
        createNewDatabase();
        createNewTable();
    }

    private final String URL = "jdbc:sqlite:" + System.getProperty("user.dir") + "/letmein.db";

    private void createNewDatabase() {

        // If database isn't already made, it will be made
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createNewTable() {
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS jobs (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	status varchar(10) NOT NULL,\n"
                + "	date datetime NOT NULL\n"
                + " company varchar(40) NOT NULL\n"
                + " position varchar(40) NOT NULL\n"
                + " type integer NOT NULL\n" // 0 = Full Time, 1 = Internship
                + ");";
        
        try (Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Can add more functionality
    // Create row
    // Delete row
    // Edit row
}