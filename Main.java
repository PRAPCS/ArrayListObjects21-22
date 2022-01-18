import java.util.*;
class Main {
  public static void main(String[] args) {
    //Creates an ArrayList called garage that stores car objects
    ArrayList<Cars> garage = new ArrayList<Cars>();

    //Creates a Car Object
    Cars car1 = new Cars("Red",32);
    //Adds the Car object to the list
    garage.add(car1);
    //Creates and adds a car object to the list all in one line
    garage.add(new Cars("Blue",42));
    //Cycles through the list getting each object one at a time and runs the toString() method
    for(int i=0; i<garage.size();i++){
      System.out.println(garage.get(i));
    }

    System.out.println(garage.get(1).getColor().toUpperCase());
    garage.get(0).setColor("Yellow");

    for(Cars c:garage){
      System.out.println(c);
    }

  }
}