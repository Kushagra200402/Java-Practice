package introduction.properties.inheritance;

public class BoxColour extends BoxWeight{
    String colour;

    BoxColour(double s, double wght, String col){
        super(s, wght);
//        this.colour = "white"; //white will overlap the passed parameter and be printed.
        this.colour = col;
    }
}
