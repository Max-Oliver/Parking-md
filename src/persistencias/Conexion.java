package persistencias;

import java.sql.*;
//https://fernando-gaitan.com.ar/conectar-java-con-mysql-en-netbeans/
public class Conexion 
{
   private static Connection cnx = null;
   
   public static Connection obtener() throws SQLException, ClassNotFoundException 
   {
      if (cnx == null) 
      {
         try 
         {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/magic", "root", "1234");
         } 
         catch (SQLException ex) 
         {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) 
         {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return cnx;
   }
   public static void cerrar() throws SQLException 
   {
      if (cnx != null) 
      {
         cnx.close();
      }
   }
}