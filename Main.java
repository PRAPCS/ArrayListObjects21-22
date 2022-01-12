import java.util.*;
class Main {
  public static void main(String[] args) {
    
    ArrayList<Cars> garage = new ArrayList<Cars>();

    Cars car1 = new Cars("Red",32);
    garage.add(car1);

    garage.add(new Cars("Blue",42));

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