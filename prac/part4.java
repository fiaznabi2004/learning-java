package javafirst.prac;

public class part4 {
    public static void main(String[] args) {
        //operators in js 
        //airthmatic operators
        
        
        int a = 5; //this is  assignment operator
        int b = 10;//this is  assignment operator
        
        
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = b/a;
        int g = b%a;
        
        System.err.println(c+"," + d + "," + e + "," + f + "," + g);

        a+=2;//++
        b-=2;//--
        c*=2;
        d/=2;
       System.err.println(a+","+b+","+c+","+d);
      // postfix-increment -> i++ -> increments in the next line or first assign then increment
       //prefix-increment -> ++i -> increments in the same line  or first increment then assign
          
       //relational operators
      
       // == ->checks if equal 
       // = assigns the right value to left

       // these a ==b , a!=b .. etc in below are called expression
     System.out.println(a == b);
     System.out.println(a >= b);
     System.out.println(a <= b);
     System.out.println(a != b);
     System.out.println(a > b);
     System.out.println(a < b);
      
     //logical operators
    System.out.println((a>b)&&(a<b)); 
    System.out.println((a>b)||(a<b));
    System.out.println(!(a>b));
   


    }
}
