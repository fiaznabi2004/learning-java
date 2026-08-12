package javafirst.prac;
/**
 * part33
 */
public class part33 {

    public static void main(String[] args) {
        // Autoboxing — Java automatically converts a primitive value into its wrapper
        // object when needed.

        // Why: Things like collections (List<Integer>) and generics only work with
        // objects, not primitives, so this automatic conversion lets you use primitives
        // and wrapper types interchangeably without writing manual conversion code.

        int x = 10;
        Integer y =x;
        // here internally auto boxing is happening 
        //process -> integer y = Integer.valueof(x);
        // so primitive to wrapper

        Integer z = Integer.valueOf(x);
       // compiler does internally this in case of y

        System.out.print(x+" "+y+" "+z);
    

        //unboxing is opposite of autoboxing wrapper to primary datatype
        
        Integer a= 20;
        int b=a;//here unboxing happened
        int c= a.intValue();
        // this what java compiler did in case of b internally
        System.out.print(a + " " + b + " " + c);
        

  // we can do it when we do airthmatic operation 
    int d = 5;
    int e =6;
    Integer sum = d+e;//internally Integer.valueof(d) + Integer.valueof(e)
    System.out.println(sum);
  //autoboxing

//same can be done in case of methods

int f = 12;

print(f);//so auto and un boxing can be done in case of methods also
    }
//static as we dont need object to call it
   static void print(Integer z) {
      System.out.println(z);
    }
}