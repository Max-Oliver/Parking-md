package persistencias;

import java.sql.*;

public class Conexion {

    private String user = "root";
    private String passwd = "1234";
    private String database = "jdbc:mysql://localhost/parkingdb";
    private String driver = "com.mysql.jdbc.Driver";
    Connection connect = null;

    public Conexion() {
        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(database, user, passwd);
            if (connect != null) {
                System.out.println("Corrrecto");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public Connection getConnection() {
        return this.connect;
    }

    public void Insert(String sql) {
        try {
            Conexion conn = new Conexion();
            PreparedStatement PS;
            PS = conn.getConnection().prepareStatement(sql);
            PS.executeUpdate();
            PS.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void Select(String sql) {
        try {
            Conexion conn = new Conexion();
            PreparedStatement PS;
            PS = conn.getConnection().prepareStatement(sql);
            PS.executeUpdate();
            PS.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
