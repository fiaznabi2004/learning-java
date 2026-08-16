package javafirst.prac;

public class part37{
    public static void main(String[] args) {
        outer y = new outer();
        y.fun();
        y.bye();
    }
}
class outer{
    private int x =20;
    static int y= 10;
    //theese print s well
    void fun(){
        int z =15;//if we give it inside the code block it will print 
        //but if we do z++; it will give error
                    //this is effective local final var rule
                    // if we use local var inside the nested class it has to final or effectively final variable
                    //this rule is seen in case of local class, anonymous class and lamda fnc 

                    // the reason

                    /*
                     * Local variables live on the stack, and disappear the moment the method
                     * returns. But the local/anonymous class (or lambda) object lives on the heap,
                     * and can outlive the method call entirely (e.g., it gets returned, stored, or
                     * run on another thread later).
                     * 
                     * Since the nested class object can't "go back" and read the now-destroyed
                     * stack variable when it's finally used, Java instead copies the value into the
                     * nested class object at creation time. To make that safe, the compiler
                     * requires that the variable never change after that copy is made — otherwise
                     * the copy and the original could silently drift out of sync. Hence:
                     * effectively final (either explicitly final, or never reassigned after
                     * initialization).
                     */
        System.out.println("Fiaz");
        class local{
            void greet(){
                System.out.println("Hello "+ x +" and "+ y +" and "+z);
            }
        }
        local x =  new local();
        x.greet();
    }
    void bye(){
        System.out.println("Bye");
    }
}
//local class is a nested class which is called inside a codeblock
//it is rarely used 
// the access of outer class and restriction are as same as inner class
