/**
 * Design Pattern: Singleton
 */

package com.TeamYBB.springboot.letmein_functionality;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sqlitetutorial.net
 */

// Singleton
public class Database {
    private static Database instance = null;

    private Database() {
        createNewDatabase();
        createNewTable();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    List<String> statuses = Arrays.asList("Accepted", "Pending", "Rejected");
    List<String> types = Arrays.asList("Full Time", "Internship");

    private final String URL = "jdbc:sqlite:" + System.getProperty("user.dir")
            + "/src/main/java/com/TeamYBB/springboot/letmein_functionality/letmein.db";

    public void createNewDatabase() {

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

    public void createNewTable() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS jobs (\n" + "	id integer PRIMARY KEY,\n"
                + "	status varchar(10) NOT NULL,\n" + "	date varchar(40),\n"
                + " company varchar(40) NOT NULL,\n" + " position varchar(40),\n"
                + " type varchar(10) NOT NULL\n" + ");";

        try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Make connection to database
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + System.getProperty("user.dir")
                + "/src/main/java/com/TeamYBB/springboot/letmein_functionality/letmein.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Add new entry into database
    public boolean add(JobEntry entry) {
        String sql = "INSERT INTO jobs(status, date, company, position, type) VALUES(?, ?, ?, ?, ?)";

        String status = entry.getStatus();
        String date = entry.getDate();
        String company = entry.getCompany();
        String position = entry.getPosition();
        String type = entry.getType();

        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            if (statuses.contains(status) && types.contains(type)) {
                pstmt.setString(1, status);
                pstmt.setString(2, date);
                pstmt.setString(3, company);
                pstmt.setString(4, position);
                pstmt.setString(5, type);

                pstmt.executeUpdate();
            } else {
                // throw IllegalArgument
                return false;
            }

            //pstmt.executeUpdate();
            
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entry.setID(generatedKeys.getInt(1));
                    System.out.println(generatedKeys.getInt(1));
                }
            }

            return true;  

        } catch (SQLException e) {
            return false;
        }
    }

    // Delete entry from database
    public boolean delete(int id) {
        String sql = "DELETE FROM jobs WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);

            // execute the delete statement
            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    // Edit entry in database
    public boolean update(int id, JobEntry entry) {
        String sql = "UPDATE jobs SET status = ? , "
                + "date = ? , "
                + "company = ? , "
                + "position = ? , "
                + "type = ? "
                + "WHERE id = ?";

        String status = entry.getStatus();
        String date = entry.getDate();
        String company = entry.getCompany();
        String position = entry.getPosition();
        String type = entry.getType();

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            if (statuses.contains(status) && types.contains(type)) {
                pstmt.setString(1, status);
                pstmt.setString(5, type);
            } else {
                // throw IllegalArgument
                return false;
            }

            pstmt.setString(2, date);
            pstmt.setString(3, company);
            pstmt.setString(4, position);

            pstmt.setInt(6, id);

            // update 
            pstmt.executeUpdate();
            return true; 

        } catch (SQLException e) {
            return false; 
            // If db.update returns false, then access to db what unsuccessful
        }
    }

    // Get all rows from a table
    public ArrayList<ArrayList<String>> getAll(){
        String sql = "SELECT * FROM jobs";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
                
            ArrayList<ArrayList<String>> resQuery = new ArrayList<ArrayList<String>>();

            // loop through the result set
            while (rs.next()) {
                String id = Integer.toString(rs.getInt("id"));
                String status = (rs.getString("status"));
                String date = (rs.getString("date"));
                String company = (rs.getString("company"));
                String position = (rs.getString("position"));
                String type = (rs.getString("type"));
                            
                ArrayList<String> row = new ArrayList<String>(Arrays.asList(id, status, date, company, position, type));
                
                resQuery.add(row);
            }

            return resQuery;
        } catch (SQLException e) {
            ArrayList<ArrayList<String>> emptyList = new ArrayList<ArrayList<String>>();
            return emptyList;
        }
    }
}