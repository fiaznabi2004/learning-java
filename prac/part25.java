package javafirst.prac;
//multilevel_inheritence
public class part25 {
    public static void main(String[] args) {
     student s1 = new student();
     Engineeringstudent s2 = new Engineeringstudent() ;
     CSE_ENGINEERING_student s3 = new CSE_ENGINEERING_student();
     
     s1.attendence();

     s2.attendence();
     s2.Labattendence();

     s3.attendence();
     s3.Labattendence();
     s3.DSAattendence();
      }
}

class student{
    void attendence(){
        System.out.println("i am a student.present");
    }
}
class Engineeringstudent extends student{
void Labattendence(){
    System.out.println("i am an engineering student ..please consider my attendence");
}
}

class CSE_ENGINEERING_student extends Engineeringstudent{
    void DSAattendence(){
        System.out.println("i am a cse student.. please give me attendence");
    }
}