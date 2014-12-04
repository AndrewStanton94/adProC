package cwk;

/**
 *
 * @author UP683693
 */
public abstract class Box {

    public final static BoxDescriptor boxDesc = null;

    double width, depth, height = 0;
    boolean reinforcedCorners, reinforcedBottom, sealedTop = false;
    int cardGrade, numberOfColors = 0, qty = 1;

    public Box(double width, double depth, double height,
            boolean reinforcedBottom, boolean reinforcedCorners,
            boolean sealedTop,
            int cardGrade, int numberOfColors, int qty) {
        this.width = width;
        this.depth = depth;
        this.height = height;

        this.reinforcedCorners = reinforcedCorners;
        this.reinforcedBottom = reinforcedBottom;

        this.cardGrade = cardGrade;
        this.numberOfColors = numberOfColors;
        this.qty = qty;
    }
    
    public Box(double width, double depth, double height,
            boolean sealedTop,
            int cardGrade, int numberOfColors, int qty) {
        this.width = width;
        this.depth = depth;
        this.height = height;

        this.reinforcedCorners = false;
        this.reinforcedBottom = false;

        this.cardGrade = cardGrade;
        this.numberOfColors = numberOfColors;
        this.qty = qty;
    }
    
    public double getSurfaceArea() {
        return 2 * (width * depth + width * height + height * depth);
    }

    protected double getBasePrice(){
        double[] costFactors = {0, 0.5, 0.59, 0.7, 0.92, 1.35}; // 0 as placeholder
        return getSurfaceArea() * costFactors[cardGrade];
    }
    
    public abstract double getPrice();
    
    public String getPriceStr(){
        return String.format("£ %.2f", getPrice() * getQty());
    }

    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public String toString(){
        String strOut = getQty() + " of " + "Grade " + getCardGrade() + ": "+ getWidth() + " x " + getDepth() + " x " + getHeight() +
            " @ " + getPriceStr();
        return strOut;
    }
    
    public static BoxDescriptor getDescription() {
        return boxDesc;
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
