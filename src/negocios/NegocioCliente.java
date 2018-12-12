package negocios;
import persistencias.persistenciaCliente;
import java.util.Hashtable;
import presentacion.InputBox;

public class NegocioCliente 
{
    persistenciaCliente persistenciaCli = new persistenciaCliente();
                                    
    public void NewReservationMounth(Hashtable<String, InputBox> reservationMounthAssoc)
    {
        System.out.println(reservationMounthAssoc.get("document").Value());
        System.out.println(reservationMounthAssoc.get("carType").Value());
        System.out.println(reservationMounthAssoc.get("reservationTurn").Value());
        System.out.println(reservationMounthAssoc.get("carRegistration").Value());
        System.out.println(reservationMounthAssoc.get("clientName").Value());
    }
}
