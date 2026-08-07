package javafirst.prac;

public class part29 {
public static void main(String[] args) {
  
    drivable cars = new car();
    cars.start();
    cars.accelerate();
    cars.brake();

    drivable taxis = new taxi();
    taxis.start();
    taxis.accelerate();
    taxis.brake();
}    
}

interface drivable{
    void start();
    void accelerate();
    void brake();
}

class car implements drivable{
    @Override
    public void start(){
        System.out.println("the car is starting");
    }
  @Override
  public void accelerate(){
      System.out.println("the car is accelerating");
  }
  
  @Override
  public void brake() {
      System.out.println("the car is braking");
  }
}

class taxi implements drivable{
    @Override
    public void start(){
        System.out.println("the taxi is starting");
    }
    
    @Override
    public void accelerate() {
        System.out.println("the taxi is accelerating");
    }
    @Override
    public void brake(){
        System.out.println("the taxi is stopping");
    }
}