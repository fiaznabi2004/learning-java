package javafirst.prac;
//polymorphism 
class part30{
    public static void main(String[] args) {
     human h1 = new human();
     h1.run(true);
     //this will be decided on compile time before which method to run    
    }
}
//compile time polyumorphism --> method overloading(done before) -> same class same method name but different params or args
class human{
    void run(){
        System.out.println("the human is running");
    }
    void run(boolean dog)
    {
        if(dog == true)
        {
            System.out.println("the human is running faster");
        }
    }
} 


