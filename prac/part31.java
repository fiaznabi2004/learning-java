package javafirst.prac;

import java.io.Console;

class part31{
    public static void main(String[] args) {

        Console c = System.console();
         String type = c.readLine("Enter the name of your type :");
         /*
          * == checks whether two String references point to the same object in memory,
          * not whether their contents are equal. Since c.readLine() creates a new String
          * object from user input, it will almost never be == to the literal "human",
          * even if the user types "human" exactly.
          * 
          * Fix:
          * if(type.equals("human"))
          * more safer
          * if("human".equalsIgnoreCase(type))
          */
         if(type.equals("human"))
         {
            animal a = new human();
            a.run();
         }
         else
         {
            animal a = new dog();
            a.run();
         }
         // this will decide in the run time what is the type anbd allocate objects on the basis of that 
        }
}

//dynamic polymorphism --> run time polymorphism --> decided on the run time
class animal{
    void run(){
        System.out.println("the animal is running" );
    }
}
class human extends animal{
   @Override
    void run(){
        System.out.println("the human is running");
    }
}

class dog extends animal {
    @Override
    void run() {
        System.out.println("the dog is running");
    }
}

