package javafirst.prac;

//pure immutable in case of field object type(defensive copy)
public class part40 {
    public static void main(String[] args) {
        College c = new College("CCPC");
        Student s1 = new Student("Fiaz", "CSE", c);
        System.out.println(s1.getName());
        System.out.println(s1.getDepartment());
        System.out.println(s1.getCollege().getName());
        //if we try to mutate 
        s1.getCollege().name = "CESC";
        System.out.println(s1.getCollege().name);        
         System.out.println(s1.getCollege().getName());
         //everytime i am calling get college.. it is creating a new object with the reference obj properties
         //so the change we made is done on another obj but when we call it again .. we are again creating a object with new properties associated with
         //the given reference in class(College c)
    }
    //the copy done is deep copy
}

final class Student {
    private final String name;
    private final String Department;
    private final College college;

    Student(String name, String Department, College college) {
        this.name = name;
        this.Department = Department;
        this.college = new College(college.getName());// defensive copy
    }

    String getName() {
        return this.name;
    }

    String getDepartment() {
        return this.Department;
    }

    College getCollege() {
        return new College(college.getName());
    }
}

class College {
    String name;

    College(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}