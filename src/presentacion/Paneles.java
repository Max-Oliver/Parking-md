package presentacion;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

//uso un tipo de array asociativo, para accceder a un elemento por medio de un identificador (id)
import java.util.Hashtable;

import presentacion.BoxText;
import presentacion.Estilos;

public class Paneles
{
    private Hashtable<String, BoxText> listAssocBoxsCliente = new Hashtable<String, BoxText>();
    //Aclaracion: listAssoc quiere decir que es un array asociativo (por cada objeto tiene un id)
    private BoxText[] listBoxsCliente;
    
    public void ComponentesDatosCliente(JPanel contenedor)
    {   
        Estilos estilos = new Estilos();
        //componentes internos del menu cliente
        //Aclaracion : Aqui se comentan los boxtext no requeridos
        BoxText btDocumento = new BoxText();
        btDocumento.Crear("documento", "campo requerido");
        BoxText btNombre = new BoxText();
        btNombre.Crear("nombre", "campo con numero");
        
        contenedor.add(btDocumento.contenedor());
        contenedor.add(btNombre.contenedor());
        //almaceno los campos en el array asociativo campoCliente para usar a posterior
        this.listAssocBoxsCliente.put("documento", btDocumento);
        this.listAssocBoxsCliente.put("nombre", btNombre);
        this.listBoxsCliente = new BoxText[] {btDocumento, btNombre};
        
        this.AlinearContenido(contenedor, 10, 10);
    }
    
    public Hashtable<String, BoxText> getlistAssocBoxsCliente()
    {
        return this.listAssocBoxsCliente;
    }
    
    public BoxText[] getListBoxsCliente()
    {
        return this.listBoxsCliente;
    }
    
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
    public Boolean ValidarCampos(BoxText[] listaCampos)
    {
        Boolean vacio = false;
        for (int i = 0; i < listaCampos.length; i++) {
            if (listaCampos[i].Value().equals("") && listaCampos[i].isRequerido() == true) 
            {
                vacio = true;
                listaCampos[i].showError();
            }
        }
        return !vacio;//significa que si estan todos vacios, manda true para permitir la accion 
    }
    
    public void hideErrors(BoxText[] listaCampos)
    {
        for (int i = 0; i < listaCampos.length; i++) {
            listaCampos[i].hideError();
        }
    }
}