package prac;
import java.io.Console;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class part1 {
 public static void main(String[] args) {
    // output streams
    
    //System.out.println("hello world");
    //System.out.print("hello");
    //System.out.print("World");
    //int x=2;
    //System.out.printf("%d is a even number",x);


    //inputs
    //Scanner sc = new Scanner(System.in);
    //System.out.print("Enter a line:");
    //String name = sc.nextLine();
    //System.out.print(name);
    
    //for large and high performance and more manual we can use bufferReader + inputStream

    //another way
    
    //System.out.print("enter a input:");
    //Console c = System.console();
    //String name = c.readLine();
    //System.out.println(name);
    
    // we can take argument type 
    System.out.print(args[0]+args[1]);
    System.out.print("\n");
    System.out.printf("%s %s",args[0],args[1]);

    //to input and show on pop up
    int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number :"));
    JOptionPane.showMessageDialog(null,x,"Title",1);
 }    
}
/*
 * cd C:\Users\wwwfi\OneDrive\Desktop\java
 * 
 * compile --> it helps to make byte code
 * javac javafirst/part1.java
 * 
 * 
 *   run the class
 * java javafirst.part1
 */