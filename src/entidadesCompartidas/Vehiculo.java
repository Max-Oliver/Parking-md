package entidadesCompartidas;

public class Vehiculo 
{
    private int clientId;
    private String carType;
    private String carRegistration;
    
    public Vehiculo(int clientId, String carType, String carRegistration)
    {
        this.clientId = clientId;
        this.carType = carType;
        this.carRegistration = carRegistration;
    }
    
    public int ClientId()
    {
        return this.clientId;
    }
    
    public String CarType()
    {
        return this.carType;
    }
    
    public String carRegistration()
    {
        return this.carRegistration;
    }
}
