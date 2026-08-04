package javafirst.prac;
//encapsulation and access modifier
public class part23 {
    public static void main(String[] args) {
        bankacc ba = new bankacc();
        ba.deposit(600);
        ba.withdraw(200);
        
        System.out.println(ba.getbalance());
     
        
        student stu = new student(2024331106, "fiaz", "ccpc", 21);

    }
}

class bankacc{
    private double balance = 0;
    //getter 
    double getbalance(){
        return balance;
    }

    void withdraw(double amount){
        balance-=amount;
    }

    void deposit(double amount)
    {
        balance+=amount;
    }
}

class student{
private String name;
private int age;
private double reg_no;
private String college;

student(double reg_no,String name,String college,int age){
this.age=age;
this.college=college;
this.name=name;
this.reg_no=reg_no;    
}

//getter 
String getName(){
    return name;
}

String getcollegeName() {
    return college;
}

//here we can get the college name along with the student name

//setter
void Setname(String name){
    //if we want we can set validation in case of changing or setting name 
    this.name=name;
}
void Setcollege(String college){
    this.college = college;
}
//here we can set or change the college and student name and we can set the validation
//unlike constructor it is more safe


// getters andsetters aregenerally safer
// than making fields public directly,
// mainly because they let you control
// and validate access instead of just
// exposing raw data.
}



/*
 * private fields don't change how you write a constructor at all. "Private"
 * only affects where the fields can be accessed from (only inside the class
 * itself), not whether a constructor can set them.
 * 
 * Why it works: A constructor is a method that belongs to the class, so it has
 * full access to all the class's own private fields — no getters/setters needed
 * internally.
 * 
 */