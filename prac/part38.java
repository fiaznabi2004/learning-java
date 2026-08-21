package javafirst.prac;

//anonymous class->class without a name and implemented once
public class part38 {
    public static void main(String[] args) {
        man m1 = new man() {
            int age = 21;
            @Override
            void hi() {
                greet();
                System.out.println("hi i am a guest");
            }
            // only available in case of m1 and constructor cant be created
            void greet(){
                System.out.println("how are u?");
            }
        };
        m1.hi();
        System.out.println(m1);
        System.out.println(m1.name);
        //System.out.println(m1.age);  not available as not seen in main man class

        //m1.greet();  we cant call it although we defined it in the anonymous class
        //we can only call methods which we override from the main classess
        //so we can only call hi() as it is overridden 
        //we can call greet() inside the overridden method only 
    }
}
class man {
    String name = "fiaz";

    void hi() {
        System.out.println("Hi i am a man");
    }
}
