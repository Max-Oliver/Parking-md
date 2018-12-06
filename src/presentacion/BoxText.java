package presentacion;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

import presentacion.Estilos;//estilo de los componentes visuales

public class BoxText {
    private JPanel pnContenedor;
    private JTextField txtCajaTexto;
    private JLabel lbError;
    private JLabel lbInfo;
    public Boolean requerido;

    public void Crear(String descripcion, String textoError) {
        Estilos estilos = new Estilos();

        //Asigno valores iniciales (por defecto es true)
        this.requerido = true;
       
        //Creamos graficamente los componentes
        this.pnContenedor = new JPanel();
        this.pnContenedor.setSize(new Dimension(150, 70));
        this.pnContenedor.setBackground(new Color(255, 255, 255));
        this.pnContenedor.setBorder(null);
        
        this.lbInfo = estilos.MyStyleJLabel(descripcion);
        this.pnContenedor.add(this.lbInfo);
        this.lbInfo.setLocation(0, 0);

        this.txtCajaTexto = estilos.MyStyleJTextField();
        this.pnContenedor.add(this.txtCajaTexto);
        this.txtCajaTexto.setLocation(0, 25);
        
        this.lbError = estilos.MyStyleJLabel(" "+textoError);
        this.lbError.setBackground(new java.awt.Color(253, 75, 92));
        this.lbError.setForeground(new java.awt.Color(1, 1, 1));
        this.lbError.setOpaque(true); 
        this.lbError.setVisible(false);//oculto el label error
        this.pnContenedor.add(this.lbError);
        this.lbError.setLocation(0, 45);
        
        //codigo para establecer el posicionamiento de los objeto
        javax.swing.GroupLayout pnContenedorLayout = new javax.swing.GroupLayout(pnContenedor);
        pnContenedor.setLayout(pnContenedorLayout);
        pnContenedorLayout.setHorizontalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        pnContenedorLayout.setVerticalGroup(
            pnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
    }

    public JTextField CajaTexto() {
        return this.txtCajaTexto;
    }

    public JLabel lbError() {
        return this.lbError;
    }

    public JPanel contenedor() {
        return this.pnContenedor;
    }
    
    public String Value()
    {
        return this.CajaTexto().getText();
    }
    
    public void showError()
    {
        this.lbError.setVisible(true);
    }
    
    public void hideError()
    {
        this.lbError.setVisible(false);
    }
    
    public Boolean isRequerido()
    {
        return this.requerido;
    }
    
    public void setRequerido(Boolean valor)
    {
        this.requerido = valor;
    }
    
    public void setDescripcion(String texto)
    {
        this.lbInfo.setText(texto);
    }
    
    public void setTextoError(String texto)
    {
        this.lbError.setText(texto);
    }
}