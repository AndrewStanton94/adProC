package cwk;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UP683693
 */
public class DimensionVarifier extends InputVerifier {
    // Referenced 13/11/14 23:35
    // https://docs.oracle.com/javase/7/docs/api/javax/swing/InputVerifier.html

    String message;
    JLabel messageLbl;
    
    public DimensionVarifier(JLabel messageLbl){
        this.messageLbl = messageLbl;
    }
    
    public boolean verify(JComponent input) {
        JTextField tb = (JTextField) input;
        try {
            float value = Float.parseFloat(tb.getText());
            if (value > 0.1 && value <= 3) {
                tb.setBackground(Color.WHITE);
                return true;
            }
            else messageLbl.setText("Plese enter a value between 0.1 and 3 meters");
        }
        catch(NumberFormatException nfe) {
            messageLbl.setText("Please enter a number. (0.1 to 3 meters)");
        }
        tb.setBackground(Color.red);
        return false;
    }
}
