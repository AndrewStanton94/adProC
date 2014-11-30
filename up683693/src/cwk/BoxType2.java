/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk;

/**
 *
 * @author Andrew
 */
public class BoxType2 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(2, 4, 1, false, false);
    
    public BoxType2(double width, double depth, double height,
            boolean sealedTop,
            int cardGrade, int qty) {
        super(width, depth, height, false, false, sealedTop, cardGrade, 1, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
}
