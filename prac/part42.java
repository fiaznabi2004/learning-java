package javafirst.prac;

import java.util.Objects;

//other core methods of object class
public class part42 {
    // hashcode is used for collections like hashtable,hashmap,hashset
    // according to java rule
    // 1.if s1.equals(s2) is true then s1.hashCode() == s2.hashCode() must be true
    // 2.if s1.equals(s2) is false then s1.hashcode() == s2.hashCode() can be true
    // or False

    // 1st is true as a default object equals checks reference .. so when true they
    // must be pointing to same object .. thus hashcode is true
    // but as we have override the equals .. the default feature is now been
    // overriden. so hashCode must be overriden
    public static void main(String[] args) {
        Student s1 = new Student("Fiaz", 21);
        Student s2 = new Student("Fiaz", 21);
         System.out.println(s1.equals(s2));
         System.out.println(s1.hashCode() == s2.hashCode());
         //although the equals is true hashcode is not same if we dont override it like we did for equals



         //getClass-> returns class type object 
         // in java we have a class Class 
         // we return the runtime class of an object
         //that is the actual class the object instantiated from not the type of the reference variable poiting to it
         /*
          * instanceof -> Is the object this type or a subtype? (hierarchy-aware)
          * getClass() -> Is the object exactly this type? (exact match only)
          * 
          * 
          * 
          * 
          * 
          * 
          * FOR getClass:-
          * public final native Class<?> getClass(){};
          * 
          * It returns an instance of java.lang.Class, which is itself an object
          * representing metadata about a class — its name, fields, methods,
          * constructors, superclass, etc. This is the foundation of Java's reflection
          * API.
          */

         System.out.println(s1 instanceof Student);
         System.out.println(s1 instanceof Object);//it is true as it is instance of its subclass 
         System.out.println(s1.getClass());//returns class type object{including packages}
         System.out.println(s1.getClass().getName());//returns  object{including packages}

    
         Animal a = new Animal();
         Animal h = new Human();
        
//instance of checks if object is instance of the a class or its subclass
//it returns false for parent class instance as it only checks for the present or subclass instance 
//while get class returns for runtime class instance only(not the type of reference pointing to it)

         System.out.println(a instanceof Animal);
         System.out.println(h instanceof Animal);
         System.out.println(a instanceof Human);
         System.out.println(h instanceof Human);
         System.out.println(a.getClass().getName());
         System.out.println(h.getClass().getName());
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Student s = (Student) o;
        return (s.name == this.name && s.age == this.age);
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name,this.age);//it hashes the name and age of the object and return a hashCOde
        //if name and object are same .. we return same code
    }
}


class Animal{

}
class Human extends Animal{

}