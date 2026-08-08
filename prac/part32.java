package javafirst.prac;
//static and private and public usage in case of polymorphism
public class part32 {
    public static void main(String[] args) {
        parent a = new child();
        a.fun();// this will not override the parent class and the parent method will be executed as static depends on class
        System.out.println(a.x);// as the reference a is on parent so the parent a will be called 
        //in both cases polymorphism wont work

    }
}
class parent{
    int x= 32;
    static void fun(){
        System.out.println("i am parent");
    }

     private void fun2() {
        System.out.println("i am parent");
    }
    
    final void fun3() {
        System.out.println("i am parent");
    }
}
class child extends parent{
    int  x = 42;
static void fun(){
    System.out.println("i am child");
}

 private void fun2() {
    System.out.println("i am child");
}

//same function as parent but cant be overridden as they are different 
//this is due to fun2() in parent cant be accessed by  child class.. so if we create same func .. it wont be same as parent class as the parent class fun2()
//is out of scope of child due to private access modifier


//final void fun3() {
//    System.out.println("i am child");
//}
 // cant override the final method from parent as it becomes constant 
 // infact we use final class parent inorder for the parent class have no child
}