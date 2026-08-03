package javafirst.prac;
//call by value
public class part21 {
    public static void main(String[] args) {
        int x =10;
        int y= 15;
        System.out.println(x+y);
       add(x,y);

    }
   static void add(int x,int y){
     x+=10;
     y+=10;
    }
    //there is no change in values
}
 