package persistencias;
import entidadesCompartidas.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class PersistenciaReserva
{
    private Connection connect;
    private PreparedStatement statement;
    private Conexion connDB = new Conexion();
    private String sql = "";

    public void NewWashed(Reserva reservation)
    {
        System.out.println("init persistence NewWashed");
        try
        {
            sql = "INSERT INTO reserva(idCliente, idVehiculo, tipoReserva, fechaInicio, estado) values(?, ?, ?, ?, ?);";
            statement = connDB.connect.prepareStatement(sql);
            statement.setInt(1, -1);
            statement.setInt(2, reservation.vehicleId());
            statement.setInt(3, 1);//type reservation 1 = onlyWashed
            statement.setTimestamp(4, reservation.StartDate());
            statement.setBoolean(5, false);//end of reservation because is OnlyWashed
            connDB.Insert(statement);
            System.out.println(statement.toString().split(": ")[1]);
        }
        catch (Exception e)
        {
            System.out.println("error persistence Reservation - "+e.getMessage());
        }
    }
    
    public void NewReservationHour(Reserva reservation)
    {
        System.out.println("init persistence NewReservationHour");
        try
        {
            sql = "INSERT INTO reserva(idCliente, idVehiculo, tipoReserva, fechaInicio, nocturno, marcaPago, estado) values(?, ?, ?, ?, ?, ?, ?);";
            statement = connDB.connect.prepareStatement(sql);
            statement.setInt(1, reservation.ClientId());
            statement.setInt(2, reservation.vehicleId());
            statement.setInt(3, 2);//type reservation 2 = res hour
            statement.setTimestamp(4, reservation.StartDate());
            statement.setBoolean(5, reservation.isNight());
            statement.setBoolean(6, reservation.PaymentMark());
            statement.setBoolean(7, reservation.State());
            connDB.Insert(statement);
            System.out.println(statement.toString().split(": ")[1]);
        }
        catch (Exception e)
        {
            System.out.println("error persistence Reservation - "+e.getMessage());
        }
    }

    public void NewReservationMounth(Reserva reservation)
    {
        System.out.println("init persistence NewReservationMounth");
        try
        {
            sql = "INSERT INTO reserva(idCliente, idVehiculo, tipoReserva, fechaInicio, nocturno, marcaPago, estado) values(?, ?, ?, ?, ?, ?, ?);";
            statement = connDB.connect.prepareStatement(sql);
            statement.setInt(1, reservation.ClientId());
            statement.setInt(2, reservation.vehicleId());
            statement.setInt(3, 3);//type reservation 2 = res hour
            statement.setTimestamp(4, reservation.StartDate());
            statement.setBoolean(5, reservation.isNight());
            statement.setBoolean(6, reservation.PaymentMark());
            statement.setBoolean(7, reservation.State());
            connDB.Insert(statement);
            System.out.println(statement.toString().split(": ")[1]);
        }
        catch (Exception e)
        {
            System.out.println("error persistence Reservation - "+e.getMessage());
        }
    }

}
