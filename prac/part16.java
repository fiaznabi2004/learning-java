package javafirst.prac;

public class part16 {

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        System.out.println(s1.name);// all gives the default value
        System.out.println(s1.cgpa);// all gives the default value
        System.out.println(s1.age);// all gives the default value

        s2.name = "fiaz";
        s2.age = 16;
        s2.cgpa = 4.00;
        System.out.println(s2.name);
        System.out.println(s2.cgpa);
        System.out.println(s2.age);

        // now we have initialzed or declared the value
        // but it is a bit lengthy process as we need to assign each value one by one
        // so we can use constructor

        student1 s3 = new student1("fiaz",21,3.99);
        // we can give no parameter .. then the default constructor which we created along the parameterized constructor will be called
       //if we give parameter then the parameterized constructor will be called
        System.out.println(s3.name);
        System.out.println(s3.cgpa);
        System.out.println(s3.age);
      
    }
}

class student {
    int age;
    double cgpa;
    String name;

}

class student1{
    int age;
    double cgpa;
    String name;

    student1(){

    }
    student1(String n,int a,double c){
      name =n;
      age=a;
      cgpa=c;
    }
    //this is an example of constructor overloading
    

}

// the character inside the class are instance variable
// all the behaviour or functions inside the class are instance method
// instance variable has default value unlike local variable
