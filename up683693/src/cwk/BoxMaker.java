package cwk;

/**
 *
 * @author up683693
 */
public class BoxMaker {
    String message;
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
            Object cardGrade, Object numberOfColors, int qty) {
        this.width = width;
        this.depth = depth;
        this.height = height;

        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorners = reinforcedCorners;
        this.sealedTop = sealedTop;

        this.cardGrade = getCardGrade(cardGrade);
        this.numberOfColors = getColours(numberOfColors);
        
        this.qty = qty;
    }

    private int getCardGrade(Object card){
        switch((String) card){
            case "Grade 1": return 1;
            case "Grade 2": return 2;
            case "Grade 3": return 3;
            case "Grade 4": return 4;
            case "Grade 5": return 5;
        }
        return -1;
    }
    
    private int getColours(Object numberOfColors){
        switch ((String) numberOfColors){
            case "No colours": return 0;
            case "1 Colour": return 1;
            case "2 Colours": return 2;
        }
        return -1;
    }
    
    private int getType() {
        for(int i = 0; i < boxDescs.length; i++)
        {
            if (boxDescs[i].match(cardGrade, numberOfColors, reinforcedBottom, reinforcedCorners)){
                return i + 1;
            }
        }
        System.err.println("Does not match");
        message = "Invalid combination, please try again";
        return -1;
    }
    
    public Box createBox(){
        switch (getType()){
            case 1:
                Box boxT1 = new BoxType1(width, depth, height, sealedTop,
                                    cardGrade, qty);
                message = boxT1.getPriceStr() + " added to order";
                return boxT1;
            case 2:
                Box boxT2 = new BoxType2(width, depth, height, sealedTop,
                                    cardGrade, qty);
                message = boxT2.getPriceStr() + " added to order";
                return boxT2;
            case 3:
                Box boxT3 = new BoxType3(width, depth, height, sealedTop,
                                    cardGrade, qty);
                message = boxT3.getPriceStr() + " added to order";
                return boxT3;
            case 4:
                Box boxT4 = new BoxType4(width, depth, height, reinforcedBottom,
                                    reinforcedCorners, sealedTop, cardGrade,
                                    numberOfColors, qty);
                message = boxT4.getPriceStr() + " added to order";
                return boxT4;
            case 5:
                Box boxT5 = new BoxType5(width, depth, height, reinforcedBottom,
                                    reinforcedCorners, sealedTop, cardGrade,
                                    numberOfColors, qty);
                message = boxT5.getPriceStr() + " added to order";
                return boxT5;
            default:
                return null;
        }
    }
    
    public String getMessage(){
        return message;
    }
}