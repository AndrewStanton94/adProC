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
public class BoxType3 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(2, 5, 2, false, false);
    
    public BoxType3(double width, double depth, double height,
            boolean sealedTop,
            int cardGrade, int qty) {
        super(width, depth, height, sealedTop, cardGrade, 2, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
    
    public double getPrice() {
        double baseCost = getBasePrice();
        double additionalCosts = baseCost * 0.15;
        additionalCosts += hasSealedTop() ? baseCost * 0.06 : 0;
        return getBasePrice() + additionalCosts;
    }
}
