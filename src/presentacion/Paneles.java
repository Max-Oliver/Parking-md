package presentacion;
import java.util.Enumeration;
import javax.swing.*;
import java.util.Hashtable;

public class Paneles
{      
    //Valida Campos vacios OBLIGATORIOS
    public Boolean ValidateInputBoxs(InputBox[] inputBoxs)
    {
        System.out.println("start validation InputBoxs");
        Boolean clear = false;
        
        for (int i = 0; i < inputBoxs.length; i++) {
            if (inputBoxs[i].Value().equals("") && inputBoxs[i].isRequired() == true) 
            {
                clear = true;
                inputBoxs[i].setVisibleError(true);
            }
        }
        System.out.println("end validation InputBoxs");
        return !clear;//significa que si estan todos vacios, manda true para permitir la accion 
    }
    
    public void hideErrors(InputBox[] inputBoxs)
    {
        for (int i = 0; i < inputBoxs.length; i++) {
            inputBoxs[i].setVisibleError(false);
        }
    }
}