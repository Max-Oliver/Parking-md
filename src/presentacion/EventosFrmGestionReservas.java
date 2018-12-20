package presentacion;
import java.util.Hashtable;
import presentacion.InputBox;
import negocios.NegocioReserva;


public class EventosFrmGestionReservas
{
    public void NewWashed(InputBox[] onlyWashed)
    {
        System.out.println("init event NewWashed");
        Paneles panels = new Paneles();
        //oculto los mensajes de error y valido los campos requeridos
        panels.hideErrors(onlyWashed);
        if (panels.ValidateInputBoxs(onlyWashed)) 
        {
            System.out.println("succefull access");
            NegocioReserva BussinessReservation = new NegocioReserva();
        
            String carType;
            
            try 
            {  
                carType = ((String)onlyWashed[0].Value());
                
                BussinessReservation.NewWashed(carType);    
            } 
            catch (Exception e) 
            {
                System.err.println("Error detected - " + e.getMessage());
            }
        }
    }
    
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
    
    
    public void NewReservationMounth(InputBox[] reservationMounth)
    {
        System.out.println("init event NewReservationMounth");
        Paneles panels = new Paneles();
        //oculto los mensajes de error y valido los campos requeridos
        panels.hideErrors(reservationMounth);
        if (panels.ValidateInputBoxs(reservationMounth)) 
        {
            System.out.println("succefull access");
            NegocioReserva BussinessReservation = new NegocioReserva();
        
            String carRegistration;
            String carType;
            String document;
            Boolean isNight;
            Boolean paymentMark;
        
            try 
            {  
                carRegistration = ((String)reservationMounth[0].Value());
                carType         = ((String)reservationMounth[1].Value());
                document        = ((String)reservationMounth[2].Value());
                isNight         = ((Boolean)reservationMounth[3].Value());
                paymentMark     = ((Boolean)reservationMounth[4].Value());
            
                BussinessReservation.NewReservationMounth(
                        document, carType, carRegistration, isNight, paymentMark);    
            } 
            catch (Exception e) 
            {
                System.err.println("Error detected - " + e.getMessage());
            }
        }
    }
}
