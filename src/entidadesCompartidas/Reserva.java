package entidadesCompartidas;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Reserva 
{
    private String document;
    private String carType;
    private String carRegistration;
    private Boolean paymentMark;
    private Boolean state;
    private Timestamp startDate;
    
    
    public Reserva(
            String document, String carType, String carRegistration, Boolean paymentMark)
    {
        this.document = document;
        this.carType = carType;
        this.carRegistration = carRegistration;
        this.paymentMark = paymentMark;
        this.state = true;
        
        //current date
        java.util.Date utilDate = new java.util.Date();
        this.startDate = new Timestamp((long)utilDate.getTime());
        //formate date : 2004-05-20 19:01:46.593
    }
    
    public String Document()
    {
        return this.document;
    }
    
    public String CarType()
    {
        return this.carType;
    }
    
    public String CarRegistration()
    {
        return this.carRegistration;
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
