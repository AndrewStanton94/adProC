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
    public final static double PRICECONSTANT = 1.35;
    public BoxType5(double width, double depth, double height, boolean reinforcedCorners, boolean reinforcedBottom, boolean sealedTop, int cardGrade, int numberOfColors, int qty) {
        super(width, depth, height, true, true, sealedTop, cardGrade, 2, qty);
    }
    
}
