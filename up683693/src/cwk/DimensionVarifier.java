/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Andrew
 */
public class DimensionVarifier extends InputVerifier {
    // Referenced https://docs.oracle.com/javase/7/docs/api/javax/swing/InputVerifier.html
    // 13/11/14 23:35

    String message;
    
    public boolean verify(JComponent input) {
        JTextField tb = (JTextField) input;
        try {
            float value = Float.parseFloat(tb.getText());
            if (value > 0.1) {
                tb.setBackground(Color.WHITE);
                return true;
            }
            else message = "Plese enter a value between 0.1 and 3 meters";
        }
        catch(NumberFormatException nfe) {
            message = "Please enter a number. (0.1 to 3 meters)";
            System.err.println(nfe + " User has entered invalid data. Wrong type.");
        }
        tb.setBackground(Color.red);
        return false;
    }
    
    public String getMessage(){
        return message;
    }
}
