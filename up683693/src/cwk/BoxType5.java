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
public class BoxType5 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(3, 5, 2, true, true);
    
    public BoxType5(double width, double depth, double height, boolean reinforcedCorners, boolean reinforcedBottom, boolean sealedTop, int cardGrade, int numberOfColors, int qty) {
        super(width, depth, height, true, true, sealedTop, cardGrade, 2, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
}
