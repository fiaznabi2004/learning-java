package javafirst.prac;

public class part11 {
    public static void main(String[] args) {
    //function overloading
   //functions doing almost same work can be named same
   System.out.println(sum(5,10));
   System.out.println(sum(5+10,15));
   System.out.println(sum(11.11,11.12));
   greet(21,"fiaz");
   greet("fiaz", 21);
 
    
fun();
fun(2);

}
    static int sum(int a,int b){
     return a+b;
    }
    static int sum(int a,int b,int c){ //different no of parameters
        return a+b+c;
    }
    static int sum(double x,double y){//different type of parameter
        return (int)x+(int)y; //typecasting according to the return type
    }

    //function overloading also works incase of reversing the parameters
    static void greet(String name,int age){
        System.out.println("my name is "+name+". age is "+age);
    }
    static void greet(int age,String name) {
        System.out.println("my name is " + name + ". age is " + age);
    }
    //now if we give different return type
    //static void fun(){
    //    System.out.println("fiaz");
    //    return;
    //}

    //static int fun() {
    //    System.out.println("fiaz");
    //    return 4;
    //}

    //compile error:Duplicate method fun() in type part11

    //it is giving compile error as compiler dont know which type of function to run when we give fun() in main
    //so function overloading dont happen if we give different return types
    //we can fix it by changing one function name
    //or by giving functions different parameter 


    static void fun(){
        System.out.println("fiaz");
        return;
    }
    static int fun(int x){//given parameter to avoid the duplicate compile error
        System.out.println("fiaz");
        return 5;
    }
}

