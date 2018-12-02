package presentacion;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

import presentacion.BoxText;

public class Paneles
{
    public void ComponentesDatosCliente(JPanel contenedor)
    {   
        //componentes internos
        
        BoxText caja1 = new BoxText();
        caja1.Crear("documento", "campo requerido");
        BoxText caja2 = new BoxText();
        caja2.Crear("nombre", "campo con numero");
        
        contenedor.add(caja1.contenedor());
        contenedor.add(caja2.contenedor());
        
        this.AlinearContenido(contenedor, 10, 10);
    }
    
    public void AlinearContenido(JPanel panel, int left, int top) //dis = distancia
    {
        int posX=left; 
        int posY=top;
        java.awt.Component[] objs = panel.getComponents();
        for(int i=0; i<objs.length;i++)
        { 
            objs[i].setLocation(posX, posY);
            posY = (objs[i].size().height + posY) + 10;//ultimo numero es la distancia entre objs
        }
    } 
}