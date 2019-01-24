package persistencias;
import entidadesCompartidas.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersistenciaCliente 
{
    private Connection connect;
    private PreparedStatement statement;
    private Conexion connDB = new Conexion();
    private String sql = "";
    
    public int AltaCliente(Cliente client)
    {
        System.out.println("init persistence Client");
        int clientId = -1;
        
        try
        {
            sql = "INSERT INTO cliente(documento) values(?);";
            statement = connDB.connect.prepareStatement(sql);
            statement.setString(1, client.Document());
            connDB.Insert(statement);
            System.out.println(statement.toString().split(": ")[1]);//show sql sentence in console
            
            //obtain clientId
            sql = "SELECT idCliente FROM cliente WHERE documento = '"+client.Document()+"'";
            ResultSet rs = connDB.Select(sql);
            while (rs.next()) 
            {    
                clientId = rs.getInt(1);
            }            
        }
        catch (Exception e)
        {
            System.out.println("error - persistence Client - "+e.getMessage());
        }
        return clientId;
    }
}
