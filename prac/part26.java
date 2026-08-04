package javafirst.prac;
//hirerchical inheritence
class part26{
    public static void main(String[] args) {
        student s1 = new student();
        s1.attendence();

        engineer_student s2 = new engineer_student();
        s2.attendence();
        s2.labattendence();

        medical_student s3 = new medical_student();
        s3.attendence();
        s3.profattendence();
    }
}
class student{
    void attendence(){
        System.out.println("hi . i am a student .please give a attendence");
    }
}
class engineer_student extends student{
    void labattendence(){
     System.out.println("hello i am a engineering student .please give me attendence");
    }
}
class medical_student extends student{
  void profattendence(){
    System.out.println("pleasee give me attendence .. i need it please");
  }
}