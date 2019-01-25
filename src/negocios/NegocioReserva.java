package negocios;
import persistencias.PersistenciaReserva;
import entidadesCompartidas.Reserva;

public class NegocioReserva
{
    private PersistenciaReserva PersistenceRes = new PersistenciaReserva();

    public void NewWashed(int vehicleId)
    {
        try
        {
            //Reserva(int clientId, int vehicleId, Boolean isNight, Boolean paymentMark)
            //isNigth and paymentmark are no used in PersistenceReservation
            Reserva reservation = new Reserva(-1, vehicleId, false, true);
            PersistenceRes.NewWashed(reservation);
        }
        catch (Exception e)
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }
    
    public void NewReservationHour(
            int clientId, int vehicleId, Boolean paymentMark)
    {
        try
        {
            Reserva reservation = new Reserva(clientId, vehicleId, false, paymentMark);
            PersistenceRes.NewReservationHour(reservation);
        }
        catch (Exception e)
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }

    public void NewReservationMounth(
             int clientId, int vehicleId, Boolean isNight, Boolean paymentMark)
    {
        try
        {
            Reserva reservation = new Reserva(clientId, vehicleId, isNight, paymentMark);
            PersistenceRes.NewReservationMounth(reservation);
        }
        catch (Exception e)
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }

}
