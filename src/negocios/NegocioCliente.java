package negocios;
import persistencias.persistenciaCliente;
import java.util.Hashtable;
import presentacion.BoxText;

public class NegocioCliente 
{
    persistenciaCliente persistenciaCli = new persistenciaCliente();
                                    
                                       //<ID, objeto>
    public void AltaCliente(Hashtable<String, BoxText> camposCliente)
    {
        System.out.println(camposCliente.get("documento").Value());   
    }
}
