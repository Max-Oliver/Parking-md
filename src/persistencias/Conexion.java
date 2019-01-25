package persistencias;

import java.sql.*;
import configuracion.ConfBaseDatos; //aqui obtengo las variables

public class Conexion 
{  
      private ConfBaseDatos confBD = new ConfBaseDatos();
      private String user     = confBD.getUser();
      private String passwd   = confBD.getPassword();
      private String database = confBD.getDatabase();
      private String driver   = confBD.getDriver();
      public Connection connect;
    
    public Conexion() 
    {
        System.out.println(database+"."+user+"."+passwd);
        try 
        {
            Class.forName(driver);
            connect = DriverManager.getConnection(database, user, passwd);
            
            if (connect != null) 
            {
                System.out.println("Correcto");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la conexion - "+ e.getMessage());
        }
    }

    public Connection getConnection() 
    {
        return this.connect;
    }

    public void Insert(PreparedStatement statement) 
    {
        try 
        {
            Conexion conn = new Conexion();
            PreparedStatement PS;
            PS = statement;
            PS.executeUpdate();
            PS.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error en sql - "+e.getMessage());
        }
    }
    
    public ResultSet Select(String sql) 
    {
        ResultSet rs = null;
        
        System.out.println("===========================");
        try 
        {
            Conexion conn = new Conexion();
            Statement stmt = conn.connect.createStatement();
            rs = stmt.executeQuery(sql);
        } 
        catch (Exception e) 
        {
            System.err.println("Select error - "+e.getMessage());
        }
        System.out.println("===========================");
        return rs;
    }
}
