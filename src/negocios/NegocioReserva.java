package negocios;
import persistencias.persistenciaReserva;
import entidadesCompartidas.Reserva;

public class NegocioReserva
{
    private persistenciaReserva PersistenceRes = new persistenciaReserva();

    public void NewWashed(String carType)
    {
        try
        {
            Reserva reservation = new Reserva("-1", carType, "-1", false, true);
            PersistenceRes.NewWashed(reservation);
        }
        catch (Exception e)
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }
    
    public void NewReservationHour(
            String document, String carType, String carRegistration, Boolean paymentMark)
    {
        try
        {
            Reserva reservation = new Reserva(document, carType, carRegistration, false, paymentMark);
            PersistenceRes.NewReservationHour(reservation);
        }
        catch (Exception e)
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }

    public void NewReservationMounth(
             String document, String carType, String carRegistration, Boolean isNight, Boolean paymentMark)
    {
        try
        {
            Reserva reservation = new Reserva(document, carType, carRegistration, isNight, paymentMark);
            PersistenceRes.NewReservationMounth(reservation);
        }
        catch (Exception e)
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }

}
