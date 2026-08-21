package javafirst.prac;

//immutable class
public class part39 {
    public static void main(String[] args) {
        College c = new College("CCPC");
        Student s1 = new Student("Fiaz", "Cse", c);
        System.out.println(s1.getName());
        System.out.println(s1.getDept());
        System.out.println(s1.getCollege());
        System.out.println(s1.getCollege().getName());
        // although we gave a new class to the new field
        // we can modify it
        s1.getCollege().name = "CESC";// we got a temporary ref to the college object and can access all the
                                      // properties of that object
        System.out.println(s1.getCollege().name);
        System.out.println(s1.getCollege().getName());

        // so it not fully immutable
    }
}

final class Student {
    private final String name;
    private final String Department;
    private final College college;
    // if we need to access more info about a field inside a class .. we can make a
    // object from that class and define it and pass the reference of that object to
    // the constructor
    // in that case as we are directly passing reference to the constructor ... it
    // becomes shallow copy as both s1 ref and college ref points to the same object

    Student(String name, String Department, College college) {
        this.name = name;
        this.Department = Department;
        this.college = college;
        // this is an exqample of shallow copy (same address and copy the address and
        // putting into s1 object
        // s1.college is a copy of college object(shallow copy))
    }// as we set final we are defining the fields for first time in constructor

    // only getters
    String getName() {
        return this.name;
    }

    String getDept() {
        return this.Department;
    }

    College getCollege() {
        return this.college;
    }// this returns a reference to the college object
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


//for being purely immutable we need to do defensive copy in both constructor and getter