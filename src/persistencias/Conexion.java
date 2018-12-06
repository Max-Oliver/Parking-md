package persistencias;

import java.sql.*;
import configuracion.ConfBaseDatos; //aqui obtengo las variables

public class Conexion {
    ConfBaseDatos confBD = new ConfBaseDatos();
    private String user     = confBD.getUser();
    private String passwd   = confBD.getPassword();
    private String database = confBD.getDatabase();
    private String driver   = confBD.getDriver();
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
