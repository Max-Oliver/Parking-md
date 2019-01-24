package negocios;
import persistencias.PersistenciaCliente;
import entidadesCompartidas.Cliente;

public class NegocioCliente 
{
    PersistenciaCliente persistenceCli = new PersistenciaCliente();
                                    
    public int NewClient(String document)
    {
        Cliente client = new Cliente(document);
        return persistenceCli.AltaCliente(client);
    }
}
