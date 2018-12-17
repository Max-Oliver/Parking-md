package negocios;
import persistencias.persistenciaReserva;
import entidadesCompartidas.Reserva;

public class NegocioReserva 
{
    private persistenciaReserva PersistenceRes = new persistenciaReserva();
    
    public void NewReservationHour(
            String document, String carType, String carRegistration, Boolean paymentMark)
    {
        try 
        {
            Reserva reservation = new Reserva(document, carType, carRegistration, paymentMark);
            PersistenceRes.NewReservationHour(reservation);
        } 
        catch (Exception e) 
        {
            System.err.println("Error detected - " + e.getMessage());
        }
    }
    
    
    public void NewReservationMounth(
            String document, String carType, String carRegistration, Boolean paymentMark)
    {
       
    }
    
    
}
