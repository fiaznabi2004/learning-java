package javafirst.prac;
//final keyword and its use
public class part20 {
   public static void main(String[] args) {
    random x = new random();
    System.out.print(x.pi);
    
}   
}
class random{
    final double pi;
    final double fix = 10;//this value is constant
    static final int  x;// here as static we cant initialize in constructor
    // as final we need to initialize once

    random(){
        pi =3.14;
    }
    // we can declare fix variable in these two ways
   static{
    x=20;
   }
}