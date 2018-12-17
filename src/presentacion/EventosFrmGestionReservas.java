package presentacion;
import java.util.Hashtable;
import presentacion.InputBox;
import negocios.NegocioReserva;


public class EventosFrmGestionReservas
{
    public void NewReservationHour(InputBox[] reservationHour)
    {
        System.out.println("init event NewReservationHour");
        Paneles panels = new Paneles();
        //oculto los mensajes de error y valido los campos requeridos
        panels.hideErrors(reservationHour);
        if (panels.ValidateInputBoxs(reservationHour)) 
        {
            System.out.println("succefull access");
            NegocioReserva BussinessReservation = new NegocioReserva();
        
            String carRegistration;
            String carType;
            String document;
            Boolean paymentMark;
        
            try 
            {  
                carRegistration = ((String)reservationHour[0].Value());
                carType         = ((String)reservationHour[1].Value());
                document        = ((String)reservationHour[2].Value());
                paymentMark     = ((Boolean)reservationHour[3].Value());
            
                BussinessReservation.NewReservationHour(
                        document, carType, carRegistration, paymentMark);    
            } 
            catch (Exception e) 
            {
                System.err.println("Error detected - " + e.getMessage());
            }
        }
    }
    
}
