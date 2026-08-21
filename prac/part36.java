package javafirst.prac;

import javafirst.prac.outer.inner;

public class part36 {
public static void main(String[] args) {
    outer.inner x = new outer().new inner();
    
    //outer y = new outer();
    //outer.inner z = y.new inner();//Outer.Inner -> "the Inner class that belongs to Outer"
    
    System.out.println(x.x);//this will give the inner x value  as the inner class has only one attribute x
    //we cant access x and y of outer  from the inner object in main 
    x.fun();
}    
}

class outer{
    int x = 10;
    int y = 15;
   
    class inner{
        //we have a reference of outer obj(It's a reference to an object (a specific instance), not the class itself.) inside the inner object set by java
      int x=20;
    void fun(){
        System.out.println(x);//this will print the x from the inner class as the outer x is overridden by the inner x
        
        System.out.println(y);// this will print y of outer as inner dont have y value
        
        System.out.println(outer.this.x);//this points at the outer class object and print its value 
        
        // it says  => go straight to the outer object's own this, and grab its x from there."(outer.this)of outer class is
        // the inner-class equivalent of this.

    }
    }
}
//we can use static inside the inner class as they can be used after jdk 16
// but it will be shared by outer class object as for a outer obj there will be a new inner object
// with a inner object .. we will get a static var shared by the inner object 
// as in inner object we have a refeerence to outer object .. they will be shared by the outer object