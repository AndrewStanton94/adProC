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
    public final static double PRICECONSTANT = 0.7;
    
    public BoxType3(double width, double depth, double height,
            boolean sealedTop,
            int cardGrade, int qty) {
        super(width, depth, height, false, false, sealedTop, cardGrade, 2, qty);
    }
}