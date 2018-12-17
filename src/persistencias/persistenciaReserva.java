package persistencias;
import entidadesCompartidas.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class persistenciaReserva 
{
    private Connection connect;
    private PreparedStatement statement;
    private Conexion connDB = new Conexion();
    private String sql = "";
    
    public void NewReservationHour(Reserva reservation)
    {
        System.out.println("init persistence NewReservationHour");
        try 
        {
            sql = "INSERT INTO reserva(idCliente, idVehiculo, fechaInicio, marcaPago, estado) values(?, ?, ?, ?, ?);";
            statement = connDB.connect.prepareStatement(sql);
            statement.setString(1, reservation.Document());
            statement.setString(2, reservation.CarRegistration());
            statement.setTimestamp(3, reservation.StartDate());
            statement.setBoolean(4, reservation.PaymentMark());
            statement.setBoolean(5, reservation.State());  
            connDB.Insert(statement);
            System.out.println(statement.toString().split(": ")[1]);
        } 
        catch (Exception e) 
        {
            System.out.println("error persistence Reservation - "+e.getMessage());
        }
    }
    
    public void NewReservationMounth(String sql)
    {
        
    }

}

