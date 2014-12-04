package cwk;

/**
 *
 * @author UP683693
 */
public class BoxType5 extends Box{
    public final static BoxDescriptor boxDesc = new BoxDescriptor(3, 5, 2, true, true);
    
    public BoxType5(double width, double depth, double height,
            boolean reinforcedBottom, boolean reinforcedCorners,
            boolean sealedTop,
            int cardGrade, int numberOfColors, int qty) {
        super(width, depth, height, true, true, sealedTop, cardGrade, 2, qty);
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
    }
    
    public double getPrice() {
        double baseCost = getBasePrice();
        System.err.println("Basic price " + getBasePrice());
        System.err.println("2 colurs " + getBasePrice() * 0.15);
        System.err.println("rb " + getBasePrice() * 0.12);
        System.err.println("rc " + getBasePrice() * 0.08);
        System.err.println("st? " + (hasSealedTop() ? baseCost * 0.06 : 0));
        double additionalCosts = baseCost * 0.15;   // 2 colours
        additionalCosts += baseCost * 0.12;         // Reinforced bottom
        additionalCosts += baseCost * 0.08;         // Reinforced corners
        additionalCosts += (sealedTop? baseCost * 0.06 : 0);
        return getBasePrice() + additionalCosts;
    }
}
