package javafirst.prac;


//super 
class part27{
    public static void main(String[] args) {
        engineer_student s1 = new engineer_student("nabi", "fiaz",21,52,4);
        s1.print();
        s1.child();

        System.out.println(s1.name+","+s1.age+","+s1.cgpa);
        s1.print2();
    }
}
class student{
    int x=4;
    
    String name;
    int age;

    student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void xx(){
        System.out.println("hi i am the parent");
    }
}
class engineer_student extends student{
    int x=5;

    String name;//this are child class properties
    int age;    //this are child class properties
    int cgpa;
    
    engineer_student(String name,String name1,int age1,int age,int cgpa){
        super(name, age);//this are set as the parent class name and age 
        this.cgpa=cgpa;
        this.name=name1;
        this.age=age1;
    }

    void print2(){
        System.out.print(super.name+" ");
        System.out.println(super.age);
    }

    void print(){
        System.out.println("parent ->"+super.x+"..."+"child :"+x);
    }
    void child(){
        super.xx();
        System.out.println("and inside the child");
    }
}
//1st case  -> to access parent class variable
//2nd case -> to access parent method inside the child method
//3rd case using parent constructor inside the child



//if both the properties name are same then in constructor .. it will take the child name overiding the parent name
//name will call the child name not the parent name
//to print the parent name we need a seperate method inside ther child which call the super.name and super.age and prints it