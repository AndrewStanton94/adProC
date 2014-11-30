package cwk;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Order {
    ArrayList<Box> boxes = new ArrayList();
    
    public void add(Box b){
        if (b != null)      // Done here to keep MainFrame code cleaner.
            boxes.add(b);
    }
    
    public void delete(int index){
        boxes.remove(index);
    }
    
    public Object[] getBoxes(){
        return boxes.toArray();
    }
    
    public Box getBox(int index){
        return boxes.get(index);
    }
    
    public double getTotalCost(){
        double cost = 0;
        for(Box b : boxes){
            cost += b.getPrice();
        }
        return cost;
    }
    
    public String getTotalCostStr(){
        return String.valueOf(getTotalCost());
    }
}