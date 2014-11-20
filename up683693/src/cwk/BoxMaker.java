/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk;

/**
 *
 * @author up683693
 */
public class BoxMaker {
    double width, depth, height = 0;
    boolean reinforcedCorners, reinforcedBottom, sealedTop = false;
    int cardGrade, numberOfColors = 0, qty = 1;
    
    public BoxMaker(
            double width, double depth, double height,
            boolean reinforcedCorners, boolean reinforcedBottom, boolean sealedTop,
            int cardGrade, int numberOfColors, int qty){
                this.width  = width;
                this.depth  = depth;
                this.height = height;
                
                this.reinforcedCorners = reinforcedCorners;
                this.reinforcedBottom  = reinforcedBottom;
                
                this.cardGrade      = cardGrade;
                this.numberOfColors = numberOfColors;
                this.qty            = qty;
    }
    
    public boolean validate(){
        return false;
    }
}
