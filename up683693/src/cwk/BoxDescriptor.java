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
        boolean ans = cardGrade >= getMinCardGrade() && cardGrade <= getMaxCardGrade();
        System.out.println("Card grade: " + cardGrade + " -> " + ans);
        return ans;
    }
    
    public boolean matchColour(int noOfColors){
        boolean ans = noOfColors == getNoOfColors();
        System.out.println("match colour: " + noOfColors + " -> " + ans);
        return ans;
    }
    
    public boolean matchReinforcedBottom(boolean reinforcedBottom){
        boolean ans = reinforcedBottom == hasReinforcedBottom();
        System.out.println("match btm: " + reinforcedBottom + " -> " + ans);
        return ans;
    }
    
    public boolean matchReinforcedCorners(boolean reinforcedCorners){
        boolean ans = reinforcedCorners == hasReinforcedCorners();
        System.out.println("match cnr: " + reinforcedCorners + " -> " + ans);
        return ans;
    }
    
    public boolean match(int cardGrade, int colour, boolean btm, boolean cnr){
        System.out.println("In match");
        return matchCardGrade(cardGrade) &&
                matchColour(colour) &&
                matchReinforcedBottom(btm) &&
                matchReinforcedCorners(cnr);
    }
}
