package cwk;

/**
 *
 * @author UP683693
 */
public class BoxType4 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(2, 5, 2, true, false);

    public BoxType4(double width, double depth, double height, 
            boolean reinforcedBottom, boolean reinforcedCorners,
            boolean sealedTop,
            int cardGrade, int numberOfColors, int qty) {
        super(width, depth, height, true, false, sealedTop, cardGrade, 2, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
    
    public double getPrice() {
        double baseCost = getBasePrice();
        double additionalCosts = baseCost * 0.15;
        additionalCosts += baseCost * 0.12;
        additionalCosts += hasSealedTop() ? baseCost * 0.06 : 0;
        return getBasePrice() + additionalCosts;
    }
}
