package javafirst.prac;

//this keyword
//helps in chaining
public class part17 {
public static void main(String[] args) {
    student s1 = new student("ronaldo", 41, 4);
    student s2 = new student("messi",38);
    student s3 = new student("neymar");
    System.out.println(s3.cgpa);//will be 0.0 which is the default
}
//here we would get an error of it was not for constructor chaining with this keyword
// when we define messi or neymar ... we are calling the constructor with less args
//but constructor is using this() and goes to the main constructor    

}


class student{
String name;
int age;
double cgpa;
student(String name){
this(name,0,0);//this can also call another constructor fromn the current constructor
//if we gave two parameter it would have called the constructor with 2 parameter 
}
student(String name,int age)
{
this(name,age,0);  
}

//here we are giving the default value of the value not defined in the constructor
student(String name,int age,double cgpa)
{//this is being called everytime
    this.name=name;
    this.age=age;
    this.cgpa=cgpa;
}
}