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
public class BoxType1 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(1, 3, 0, false, false);

    public BoxType1(double width, double depth, double height,
            boolean sealedTop,
            int cardGrade, int qty) {
        super(width, depth, height, sealedTop, cardGrade, 0, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
    
    public double getPrice() {
        double baseCost = getBasePrice();
        return getBasePrice() + (hasSealedTop() ? baseCost * 0.06 : 0);
    }
}
