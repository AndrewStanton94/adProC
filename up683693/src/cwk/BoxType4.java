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
public class BoxType4 extends Box{
    public final static double PRICECONSTANT = 0.92;

    public BoxType4(double width, double depth, double height, boolean reinforcedCorners, boolean reinforcedBottom, boolean sealedTop, int cardGrade, int numberOfColors, int qty) {
        super(width, depth, height, true, false, sealedTop, cardGrade, 2, qty);
    }
    
    
}
