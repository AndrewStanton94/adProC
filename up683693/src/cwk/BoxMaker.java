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

    Object[] matchableArgs = new Object[4];

    BoxDescriptor[] boxDescs = {BoxType1.getDescription(),
        BoxType2.getDescription(), 
        BoxType3.getDescription(),
        BoxType4.getDescription(), BoxType5.getDescription()};

    public BoxMaker(
            double width, double depth, double height,
            boolean reinforcedBottom, boolean reinforcedCorners, boolean sealedTop,
            int cardGrade, int numberOfColors, int qty) {
        this.width = width;
        this.depth = depth;
        this.height = height;

        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorners = reinforcedCorners;
        this.sealedTop = sealedTop;

        this.cardGrade = cardGrade;
        this.numberOfColors = numberOfColors;
        this.qty = qty;

        matchableArgs[0] = cardGrade;
        matchableArgs[1] = numberOfColors;
        matchableArgs[2] = reinforcedBottom;
        matchableArgs[3] = reinforcedCorners;
    }

    public int getType() {
        for(int i = 0; i < boxDescs.length; i++)
        {
            if (boxDescs[i].match(cardGrade, numberOfColors, reinforcedBottom, reinforcedCorners)){
                System.err.println("Match");
                return i + 1;
            }
        }
        System.err.println("Does not match");
        return -1;
    }
    
    public Box createBox(){
        switch (getType()){
            case 1:
                return new BoxType1(width, depth, height, sealedTop, cardGrade, qty);
            case 2:
                return new BoxType2(width, depth, height, sealedTop, cardGrade, qty);
            case 3:
                return new BoxType3(width, depth, height, sealedTop, cardGrade, qty);
            case 4:
                return new BoxType4(width, depth, height, reinforcedCorners, reinforcedBottom, sealedTop, cardGrade, numberOfColors, qty);
            case 5:
                return new BoxType5(width, depth, height, reinforcedCorners, reinforcedBottom, sealedTop, cardGrade, numberOfColors, qty);
            default:
                return null;
        }
    }
}