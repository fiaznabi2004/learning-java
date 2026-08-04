package javafirst.prac;
//inheritence 
public class part24 {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        car c = new car();

       v.start();
       c.start();
       c.startgear();//this is only available to vehicle
    }
}

class vehicle{
     protected void start(){//it is available in the same packages and the child classes
        System.out.println("the car is starting");
    }
}
class car extends vehicle{
    //private it is only available inside the class and not in object + parent class
    //public   -> is available everywhere but parent class
     void startgear(){
        System.out.println("the gear is changing");
    }
}

//this is an example of simple inheritence
