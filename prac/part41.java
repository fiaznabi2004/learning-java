package javafirst.prac;
//Object class (main class and the root class)
public class part41 {
    //core methods -> toString(),equals(),getClass(),hashCode()
    public static void main(String[] args) {
        Student s1 = new Student("Fiaz", 21);
        System.out.println(s1.toString());
        //toString()-> returns String representation of the Object
        //Object class toString() returns ClassName@HexCode
        //we can override it in the our class to return custom representation of the object in string
        System.out.println(s1);


//equals -> compare 2 objects and return true and false based on reference
//similar to == initially
//but we can override and compare values of object instead of reference
        Student s2 = new Student("Fiaz", 21);
        System.out.println(s1.equals(s2));
        Student s3 = null;
        System.out.println(s1.equals(s3));//we need handle this exception when we override

        //another exception comes when we pass any  Object  of another class as Object is the parent class .. it can have multiple class under it
        //so if we pass a Teaqcher class or Integer class etc .. it will cause exception ClassCastException



        Integer i = 24;
        System.out.println(s1.equals(i));// to solve we need getClass()  another core method of Object class

    }
}
//super method can only be called inside a method .. same with constructor..fields can access in methods and constructor 
//same case we see for this
class Student{
    String Name;
    int age;
    Student(String Name,int age){
    this.Name = Name;
    this.age=age;
    }
    @Override  //this will override thr object class core method toString
    public String toString(){
        return  (this.Name+" , "+this.age);
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this)return true;//if both have same reference then we will send true as they point to the same object
        if (obj == null) {
            return false;//if we dont give it a null object will get NullPointerException
        }

        if (this.getClass() != obj.getClass()){
            return false;//if we pass another child class object except Student under it.... we will get a ClassCastException of we dont set it
        }
        Student s = (Student)obj; 
        return (this.Name == s.Name && this.age == s.age );
    }
}

//this is a reference (current class) and any other reference  of object is like a pointer