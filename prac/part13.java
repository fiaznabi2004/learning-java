package javafirst.prac;

public class part13 {
    //recursion
     public static void main(String[] args) {
    // print_1_to_10(10);   
     }
   
     static void print_1_to_10(int x){
      if (x==1)
      {
       System.out.println(x);
       return;
      }
    print_1_to_10(x-1);
    System.out.println(x);
   }


}
