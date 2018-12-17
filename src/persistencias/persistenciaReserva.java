package persistencias;
import entidadesCompartidas.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import persistencias.Conexion;

public class persistenciaReserva 
{
    private Connection connect;
    private PreparedStatement statement;
    private Conexion connDB;
    private String sql;
    
    public void NewReservationHour(Reserva reservation)
    {
        System.out.println("init persistence NewReservationHour");
        
        sql = "INSERT INTO reserva(idCliente, idVehiculo, fechaInicio, marcaPago, estado) values('"+reservation.Document()+"', '"+reservation.CarRegistration()+"', '"+reservation.StartDate()+"', "+reservation.PaymentMark()+", "+reservation.State()+")";
        System.out.println(sql);
        connDB.Insert(sql);
        
        /*
        try 
        {
            sql = "INSERT INTO reserva(idCliente, idVehiculo, fechaInicio, marcaPago, estado) values(?, ?, ?, ?, ?)";
            statement = connect.prepareStatement(sql);
            sentence.setString(1, reservation.Document());
            sentence.setString(2, reservation.CarRegistration());
            //sentence.setString(3, reservation.StartDate().toString());
            //sentence.setString(4, reservation.PaymentMark().toString());
            //sentence.setString(5, reservation.State().toString());
            
            //connDB.Insert(connDB.sql.toString());
            //sql = sentence.toString();
            //System.out.println(sentence.toString());
        } 
        catch (Exception e) 
        {
          System.out.println("Error persistencia reserva - "+ e.getMessage());
        }
        */
        
        
        /*//in case of add client
        try 
        {
            this.sql = "INSERT INTO cliente(documento) values(?)";
            connDB.sql = connDB.connect.prepareStatement(sql);
            connDB.sql.setString(1, reservation.Document());
            
            this.connDB.Insert(connDB.sql.toString());
            System.out.println(connDB.sql.toString());
        } 
        catch (Exception e) 
        {
            System.out.println("Error persistencia reserva - "+ e.getMessage());
        }
        */
    }
    
    public void NewReservationMounth(String sql)
    {
        
    }

}

