package introduction.properties.inheritance;

public class BoxPrice extends BoxWeight{
     double cost;

     // default constructor
     BoxPrice(){
         super();
         this.cost = -1;
     }

     //copy constructor
     BoxPrice(BoxPrice other){
         super(other);
         this.cost = other.cost;
     }

     BoxPrice(double length, double width, double height, double weight, double cost){
         super(length, height, width, weight);
         this.cost = cost;
     }

     BoxPrice(double side, double weight, double c){
         super(side, weight);
         this.cost = c;
     }
}
