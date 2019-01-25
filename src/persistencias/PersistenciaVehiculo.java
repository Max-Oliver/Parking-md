package persistencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entidadesCompartidas.Vehiculo;

public class PersistenciaVehiculo 
{
    private Connection connect;
    private PreparedStatement statement;
    private Conexion connDB = new Conexion();
    private String sql = "";    
    public String[] GetCarTypes()
    {
        String vehicles = "";
        try 
        {
            sql = "SELECT clase FROM tipoVehiculo";
            ResultSet rs = connDB.Select(sql);
            while (rs.next()) 
            {    
                vehicles += rs.getString(1) + "/";
            }            
        } 
        catch (Exception e) 
        {
            System.out.println("error persistence Vehicle - "+e.getMessage());
        }
        return vehicles.split("/");
    }
    
    public int NewVehicle(Vehiculo vehicle)
    {
        int vehicleId = -1;
        int carTypeId = -1;
        try
        {
            //obtain carTypeId
            sql = "SELECT idTipo FROM tipoVehiculo WHERE clase = '"+vehicle.CarType()+"'";
            ResultSet rs = connDB.Select(sql);
            while (rs.next()) 
            {    
                carTypeId = rs.getInt(1);
            }            
            
            sql = "INSERT INTO vehiculo(idCliente, tipoVehiculo, matricula) values(?,?,?);";
            statement = connDB.connect.prepareStatement(sql);
            statement.setInt(1, vehicle.ClientId());
            statement.setInt(2, carTypeId);
            statement.setString(3, vehicle.carRegistration());
            connDB.Insert(statement);
            System.out.println(statement.toString().split(": ")[1]);//show sql sentence in console
            
            //obtain vehicleId
            sql = "SELECT idVehiculo FROM vehiculo WHERE matricula = '"+vehicle.carRegistration()+"'";
            rs = connDB.Select(sql);
            while (rs.next()) 
            {    
                vehicleId = rs.getInt(1);
            }            
        }
        catch (Exception e)
        {
            System.out.println("error - persistence Vehiculo NewVehicle - "+e.getMessage());
        }
        return vehicleId;
    }
}
