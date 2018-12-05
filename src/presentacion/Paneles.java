package presentacion;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

import presentacion.BoxText;
import presentacion.Estilos;

public class Paneles
{
    public void ComponentesDatosCliente(JPanel contenedor)
    {   
        Estilos estilos = new Estilos();
        //componentes internos del menu cliente
        //Aclaracion : Aqui se comentan los boxtext no requeridos
        BoxText caja1 = new BoxText();
        caja1.Crear("documento", "campo requerido");
        BoxText caja2 = new BoxText();
        caja2.Crear("nombre", "campo con numero");
        
        contenedor.add(caja1.contenedor());
        contenedor.add(caja2.contenedor());
        
        /*
        JButton btnAltaCliente = estilos.MyStyleJButton("crear cliente");
        btnAltaCliente.setLocation(0, 0);
        contenedor.add(btnAltaCliente);
        */
        
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
            posY = (objs[i].size().height + posY) + 2;//ultimo numero es la distancia entre objs
        }
    } 
}