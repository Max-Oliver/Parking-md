package presentacion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import javax.swing.*;

public class Estilos {
    public JTextField MyStyleJTextField()
    {
        JTextField textField = new JTextField();
        textField.setBackground(new java.awt.Color(255, 255, 255));
        textField.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        textField.setForeground(new java.awt.Color(1, 1, 1));
        textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        textField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField.setSize(new java.awt.Dimension(150, 20));
        return textField;   
    }
    public JButton MyStyleJButton(String texto)
    {
        JButton button = new JButton();
        button.setText(texto);
        button.setBackground(new java.awt.Color(255, 255, 255));
        button.setForeground(new java.awt.Color(1, 1, 1));
        button.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        button.setSize(new Dimension(150, 20));
        return button;
    }
   
    public JLabel MyStyleJLabel(String texto)
    {
        JLabel label = new JLabel();
        label.setText(texto);
        label.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        label.setForeground(new java.awt.Color(1, 1, 1));
        label.setBorder(null);
        label.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        label.setSize(new Dimension(150,25));
        return label;   
    }
    
    public JPanel MyStyleJPanel()
    {
        JPanel panel = new JPanel();
        return panel;   
    }
    
}
