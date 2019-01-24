package entidadesCompartidas;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Reserva 
{
    private int clientId;
    private int vehicleId;
    private Boolean paymentMark;
    private Boolean isNight;
    private Boolean state;
    private Timestamp startDate;
    
    
    public Reserva(
            int clientId, int vehicleId, Boolean isNight, Boolean paymentMark)
    {
        this.clientId = clientId;
        this.vehicleId = vehicleId;
        this.isNight = isNight;
        this.paymentMark = paymentMark;
        this.state = true;
        
        //current date
        java.util.Date utilDate = new java.util.Date();
        this.startDate = new Timestamp((long)utilDate.getTime());
        //formate date : 2004-05-20 19:01:46.593
    }
    
    public int ClientId()
    {
        return this.clientId;
    }
    
    public int vehicleId()
    {
        return this.vehicleId;
    }
    
    public Boolean isNight()
    {
        return this.isNight;
    }
    
    public Boolean PaymentMark()
    {
        return this.paymentMark;
    }
    
    public Boolean State()
    {
        return this.state;
    }
    
    public Timestamp StartDate()
    {
        return this.startDate;
    }
}
