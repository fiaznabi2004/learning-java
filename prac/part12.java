package javafirst.prac;
//global scope
public class part12 {
    //chaining of functions -1
  public static void main(String[] args) {

    //local scope

    // chaining of functions -1
   a();
   //chaining of function 2
   e();
  }
  //1
 static void a(){
    System.out.println("hello from A");
    b();
 }
 static void b(){
    System.out.println("hello from B");
    c();
 }
 static void c(){
    System.out.println("helloc from C");
    d();
 }
 static void d(){
    System.out.println("hello from D...end");
 }

//2
static void e(){
    f();
    System.out.println("hello from e");
}
static void f(){
    g();
    System.out.println("Hello from f");
}
static void g(){
    h();
    System.out.println("Hello from g");
}
static void h(){
    System.out.println("Hello from h ... end");
}



 /*
  * soln 1->
  * hello from A
  * hello from B
  * helloc from C
  * hello from D...end
  *

  * //soln 2 ->
  * 
  * Hello from h ... end
  * Hello from g
  * Hello from f
  * hello from e
  */

 
 
}
