package javafirst.prac;

public class part10 {

    public static void main(String[] args) {
     //types of functions in java
     greet();
    
     sayhello("fiaz");
    
     int c= get_no_ten();
    System.out.println(c);

    int d = multiply(5, 10);
    System.out.println(d);
    
    //but if we want we dont need to collect the return value and print directly
    System.out.println(get_no_ten());
    System.out.println(multiply(4, 4));
    
    // when we call function .. we directly jump to the function from main and finish the task and come back to main
    }
    //1. no input no output
     static void greet()
     {
        System.out.println("hello");
        return;//void means empty (i.e nothing to return)
     }

     //2. inp,no output
     static void sayhello(String name)
     {
    System.out.println("hello "+name);
    return;//we dont need to write it (optional)
     } 
//3. no input output
     static int get_no_ten(){
        return 10;
     }
    //4. input output
    static int multiply(int a ,int b)
    {
        return a*b;
    }
}
