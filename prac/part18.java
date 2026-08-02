package javafirst.prac;
//chaining
public class part18 {
public static void main(String[] args) {
   student s1 = new student("fiaz");
   student s2 = new student("nidal",21);
   student s3 = new student("fiaznabi",21,4);
}
}
   class student{
       String name;
       int age;
       double cgpa;
       student(String name){
        this(name,0);//no line can be above this line
        System.out.println("this is the first constructor");
       }
       student(String name, int age){
         this(name,age,0);
         System.out.println("this is the second constructor");
       }
       student(String name,int age,double cgpa){
          this.name=name;
          this.age=age;
          this.cgpa = cgpa;
          System.out.println("this is the third constructor");
       }
   }
   //here we see how the constructor chaining works with the help of this
   
   /*soln->
    * this is the third constructor
    * this is the second constructor
    * this is the first constructor
    * this is the third constructor
    * this is the second constructor
    * this is the third constructor
    */
