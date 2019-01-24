package negocios;
import persistencias.PersistenciaVehiculo;
import entidadesCompartidas.Vehiculo;

public class NegocioVehiculo 
{
    private PersistenciaVehiculo PersistenceV = new PersistenciaVehiculo();
    public String[] GetCarTypes()
    {
        return PersistenceV.GetCarTypes();
    }
    
    public int NewVehicle(int clientId, String carType, String carRegistration)
    {
        Vehiculo vehicle = new Vehiculo(clientId, carType, carRegistration);
        return PersistenceV.NewVehicle(vehicle);
    }
}
