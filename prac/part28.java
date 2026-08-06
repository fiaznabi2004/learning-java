package javafirst.prac; 

 class part28{
    public static void main(String[] args) {
        //car c = new car(); -->this is not correct
        car c = new fuel_car();
        c.start();
        c.accelerate();
        c.brake();

        car c1 =new Electric_car();
        c1.start();
        c1.accelerate();
        c1.brake();
    }
}

abstract class car{
 abstract void  accelerate();
void start(){
    System.out.println("the car is starting");
}
void brake(){
    System.out.println("the car is stopping");
}
}

class fuel_car extends car{
   @Override
    void accelerate(){
    System.out.println("the fuel car is accelerating");
   }
}
class Electric_car extends car{
@Override
    void accelerate(){
    System.out.println("the ELectric car is accelerating");
}
}


// here we created a abstract class called car 
// an abstract class cant be instantiated 
//we can create high level abstraction by creating child class of this abstract class
// the child class must provide/define the methode not defined in the abstract class

// an abstract class is created for creating high level abstraction .
// it helps in seperating What from How
//we apply high level abstraction with the help of inheritence
