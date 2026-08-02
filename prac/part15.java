package javafirst.prac;


//oops
public class part15 {
public static void main(String[] args) {
student s1 = new student();
student s2 = new student();

//s1 object characters
s1.name="fiaz";
s1.age=21;
s1.cgpa=3.44;
s1.height=170;
s1.weight = 69;

//s2 object character
s2.height=172;
s2.age=21;
s2.name="nidal";
s2.weight=74;
s2.cgpa=3.88;

//s1 behaviour
s1.attendence();
s1.print();

//s2 behaviour
s2.attendence();
s2.print();

}
    
}
class student{
    String name;
    int age;
    double cgpa;
    double weight;
    double height;
    //these are the chharacteristics of an objet in the class

    //behaviour are written in methods
    void attendence(){
        System.out.println("the attendence is not 100% for " + name);
    }
    void print(){
        System.out.println(name+","+age+","+cgpa+","+weight+","+height);
    }
}
