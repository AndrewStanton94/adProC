package cwk;

/**
 *
 * @author UP683693
 */
public class BoxType1 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(1, 3, 0, 
                                                        false, false);

    public BoxType1(double width, double depth, double height,
            boolean sealedTop,
            int cardGrade, int qty) {
        super(width, depth, height, sealedTop, cardGrade, 0, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
    
    public double getPrice() {
        double baseCost = getBasePrice();
        return getBasePrice() + (hasSealedTop() ? baseCost * 0.06 : 0);
    }
}
