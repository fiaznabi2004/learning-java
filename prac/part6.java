package javafirst.prac;

import java.io.Console;

public class part6 {
   public static void main(String[] args) {
    //our first java project with switch statement
    Console c = System.console();
    int i = Integer.parseInt(c.readLine()); 
    switch(i){
        case 1:{
         System.out.println("hello 1");
         break;
        }
        case 2:{
         System.out.println("Hello 2");
         break;
        }
        case 3: {
           System.out.println("Hello 3");
           break;
        }
        case 4: {
           System.out.println("Hello  without break ");// as we didnt gave break .. it should print the statement with the any case below it  
        }   // but in this case upto case 3 everything will be same as they have break

        //incase none had break .. we would have print the whole statement including all cases and default

        default:{
         System.out.println("hello default");
         break;
        }
    }
   }    
}

// here switch statement is more optimized than if else statment
