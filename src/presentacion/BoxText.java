package presentacion;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class BoxText {
    private JPanel pnContenedor;
    private JTextField txtCajaTexto;
    private JLabel lbError;
    private JLabel lbInfo;

    public void Crear(String descripcion, String textoError) {
        this.pnContenedor = new JPanel();
        this.pnContenedor.setSize(new Dimension(140, 50));
        this.pnContenedor.setBackground(new Color(200, 200, 200));
        
        this.lbInfo = this.MyStyleLabel(descripcion);
        this.pnContenedor.add(this.lbInfo);
        this.lbInfo.setLocation(0, 0);

        this.txtCajaTexto = new JTextField();
        this.txtCajaTexto.setSize(new Dimension(100, 20));
        this.txtCajaTexto.setBackground(new Color(255, 255, 255));
        this.pnContenedor.add(this.txtCajaTexto);
        this.txtCajaTexto.setLocation(0, 12);
        
        this.lbError = this.MyStyleLabel(textoError);
        this.pnContenedor.add(this.lbError);
        this.lbError.setLocation(0, 34);
        
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
    
    public void setDescripcion(String texto)
    {
        this.lbInfo.setText(texto);
    }
    
    public void setTextoError(String texto)
    {
        this.lbError.setText(texto);
    }

    private JLabel MyStyleLabel(String texto) {
        JLabel label = new JLabel();
        label.setText(texto);
        label.setBackground(new Color(255, 255, 255));
        label.setSize(new Dimension(140, 10));
        return label;
    }
}