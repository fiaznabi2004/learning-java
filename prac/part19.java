package javafirst.prac;

public class part19 {
   public static void main(String[] args) {
    student s1= new student("fiaz", 21, 4.00);
    student s2 = new student("nidal", 20, 4.00);

    student.college="SUST";//istead of declaring here we can declare in the static block 
    //this block is like that of constructor of the non-static variable
    
    System.out.println(s1.name+","+s1.age+","+s1.college);
    System.out.println(s2.name + "," + s2.age + "," + s2.college); //we could run student.college instead of object.college  
 
    // static method and variable are shared by all created object from the class
    //so the value is same for all object
   
   
    s1.college = "IUT";

    System.out.println(s1.name + "," + s1.age + "," + s1.college);
    System.out.println(s2.name + "," + s2.age + "," + s2.college);
    //if we change the static variable by accessing through object .. then we can change the main static variable
    //this will change the value for all objects by just changing an object static property
  
}   
}

class student{
    String name;
    int age;
    double cgpa;
    static String college;
    static long rollno;
    student(String name,int age,double cgpa)
    {
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
    static{
    rollno = 2024_331_106;
    }//a static block which only access static var and is accessible and shared by the objects
}