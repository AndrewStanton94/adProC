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
public class BoxDescriptor {
    private final int minCardGrade, maxCardGrade, noOfColors;
    private final boolean reinforcedBottom, reinforcedCorners;
    
    public BoxDescriptor(int minCardGrade, int maxCardGrade, int noOfColors,
                        boolean reinforcedBottom, boolean reinforcedCorners){
        
        this.minCardGrade = minCardGrade;
        this.maxCardGrade = maxCardGrade;
        this.noOfColors   = noOfColors;
        
        this.reinforcedBottom  = reinforcedBottom;
        this.reinforcedCorners = reinforcedCorners;
    }
    
    public int getMinCardGrade(){
        return minCardGrade;
    }
    
    public int getMaxCardGrade(){
        return maxCardGrade;
    }
    
    public int getNoOfColors(){
        return noOfColors;
    }
    
    public boolean hasReinforcedBottom(){
        return reinforcedBottom;
    }
    
    public boolean hasReinforcedCorners(){
        return reinforcedCorners;
    }
    
    public boolean matchCardGrade(int cardGrade){
        return cardGrade >= getMinCardGrade() && cardGrade <= getMaxCardGrade();
    }
    
    public boolean matchColour(int noOfColors){
        return noOfColors == getNoOfColors();
    }
    
    public boolean matchReinforcedBottom(boolean reinforcedBottom){
        return reinforcedBottom == hasReinforcedBottom();
    }
    
    public boolean matchReinforcedCorners(boolean reinforcedCorners){
        return reinforcedBottom == hasReinforcedCorners();
    }
}
