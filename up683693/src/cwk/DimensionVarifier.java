/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Andrew
 */
public class DimensionVarifier extends InputVerifier {
    // Referenced https://docs.oracle.com/javase/7/docs/api/javax/swing/InputVerifier.html
    // 13/11/14 23:35
    // Use of abstract class. Investigate

    public boolean verify(JComponent input) {
        JTextField tb = (JTextField) input;
        try {
            float value = Float.parseFloat(tb.getText());
            if (value > 0) {
                tb.setBackground(Color.WHITE);
                return true;
            }
        }
        catch(NumberFormatException nfe) {
            System.err.println("User has entered invalid data. What a n00b");
        }
//        System.err.println("Shouldn't be here. Uncreachable in DimensionVarifier");
        tb.setText("Lol wut");
        tb.setBackground(Color.red);
        return false;
    }
}
