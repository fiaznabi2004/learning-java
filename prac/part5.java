package javafirst.prac;

import java.io.Console;

public class part5 {
public static void main(String[] args) {
    Console c = System.console();
    int age = Integer.parseInt(c.readLine());
    if (age<60) {
        if (age>18) {
            System.out.println("you are still child");
        }
        else if (age == 18) {
            System.out.println("you are officially an adult");
        }
        else if (age>18 && age<29) {
            System.out.println("you are still adult");
        }
        else System.out.println("you are still unc");
    }
    else if(age>60)
    {
      System.out.println("you are officially gramp");
    }
    else{
        System.err.println("you are on the way to be a gramp");
    }
}
    
}