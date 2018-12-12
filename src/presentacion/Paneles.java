package presentacion;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

//uso un tipo de array asociativo, para accceder a un elemento por medio de un identificador (id)
import java.util.Hashtable;

import presentacion.InputBox;
import presentacion.frmGestionReservas;

public class Paneles
{   
    //METODO PARA ALINEAR ELEMENTOS DENTRO DEL PANEL
    public void AlinearContenido(JPanel panel, int left, int top) //dis = distancia
    {
        int posX=left; 
        int posY=top;
        java.awt.Component[] objs = panel.getComponents();
        for(int i=0; i<objs.length;i++)
        { 
            objs[i].setLocation(posX, posY);
            posY = (objs[i].size().height + posY) + 2;//ultimo numero es la distancia entre objs
        }
    }
    
    
    //Valida Campos vacios OBLIGATORIOS
    public Boolean ValidarCampos(InputBox[] inputBoxs)
    {
        Boolean clear = false;
        for (int i = 0; i < inputBoxs.length; i++) {
            if (inputBoxs[i].Value().equals("") && inputBoxs[i].isRequired() == true) 
            {
                clear = true;
                inputBoxs[i].setVisibleError(true);
            }
        }
        return !clear;//significa que si estan todos vacios, manda true para permitir la accion 
    }
    
    public void hideErrors(InputBox[] inputBoxs)
    {
        for (int i = 0; i < inputBoxs.length; i++) {
            inputBoxs[i].setVisibleError(false);
        }
    }
}