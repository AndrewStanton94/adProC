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
public abstract class Box {
    final double PRICECONSTANT = 0.5;
    
    double width, depth, height = 0;
    boolean reinforcedCorners, reinforcedBottom, sealedTop = false;
    int cardGrade, numberOfColors = 0, qty = 1;

    public double getArea() {
        return width * depth * height;
    }

    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public double getPRICECONSTANT() {
        return PRICECONSTANT;
    }
    
    //<editor-fold desc="type: double">
    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }
    //</editor-fold>
    
    //<editor-fold desc="type: bool">
    public boolean hasReinforcedCorners() {
        return reinforcedCorners;
    }

    public boolean hasReinforcedBottom() {
        return reinforcedBottom;
    }

    public boolean hasSealedTop() {
        return sealedTop;
    }
    //</editor-fold>

    //<editor-fold desc="type: int">
    public int getCardGrade() {
        return cardGrade;
    }
    
    public int getNumberOfColors() {
        return numberOfColors;
    }

    public int getQty() {
        return qty;
    }
    //</editor-fold>
    // /Accessors </editor-fold>  

    //<editor-fold defaultstate="collapsed" desc="Mutators">
    //<editor-fold desc="type: double">
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    //</editor-fold>

    //<editor-fold desc="type: bool">
    public void setReinforcedCorners(boolean reinforcedCorners) {
        this.reinforcedCorners = reinforcedCorners;
    }

    public void setReinforcedBottom(boolean reinforcedBottom) {
        this.reinforcedBottom = reinforcedBottom;
    }

    public void setSealedTop(boolean sealedTop) {
        this.sealedTop = sealedTop;
    }
    //</editor-fold>

    //<editor-fold desc="type: int">
    public void setCardGrade(int cardGrade) {
        this.cardGrade = cardGrade;
    }

    public void setNumberOfColors(int numberOfColors) {
        this.numberOfColors = numberOfColors;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    //</editor-fold>
    // /Mutators </editor-fold>
}
