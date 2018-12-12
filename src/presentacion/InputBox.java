/*
Use Guide:    
    import presentacion.InputBox;       //input Swing object / label error  of the input method
    InputBox DocumentBxI = new InputBox(documentTf, documentErrorLBL, required);
                                        JComboBox
you can only use one input swing object
*/
package presentacion;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class InputBox 
{
    private Boolean required;
    private JLabel errorLabel;
    private Object inputObject;
    
    public InputBox(Object inputObject, JLabel errorLabel, Boolean required)
    {
        errorLabel.setVisible(false);
        
        this.inputObject =  inputObject;
        this.errorLabel = errorLabel;
        this.required = required;
    }
    
    public void setVisibleError(Boolean value)
    {
        this.errorLabel.setVisible(value);
    }
    
    public Object Value()
    {
        Object value = null;
        switch(inputObject.getClass().getName())
        {
            case "javax.swing.JTextField":
                value = ((JTextField)this.inputObject).getText();
                break;
            case "javax.swing.JComboBox":
                value = ((JComboBox)this.inputObject).getSelectedItem().toString();
                break;    
            case "javax.swing.JRadioButton":
                value = ((JRadioButton)this.inputObject).isSelected();
                break;
        }
        return value;
    }
    
    public void setValue(Object data)
    {
        switch(inputObject.getClass().getName())
        {
            case "javax.swing.JTextField":
                ((JTextField)this.inputObject).setText(data.toString());
                break;
            case "javax.swing.JComboBox":
                ((JComboBox)this.inputObject).setModel(new DefaultComboBoxModel<>((String[])data));
                break;
        }
    }
    
    public Boolean isRequired()
    {
        return this.required;
    }
    
    public void setRequerido(Boolean value)
    {
        this.required = value;
    }
    
    public void setErrorText(String text)
    {
        this.errorLabel.setText(text);
    }
}