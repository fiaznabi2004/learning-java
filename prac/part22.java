package javafirst.prac;
//call by reference but there is no call by ref in java .. all is done in non primitive d.t
public class part22 {
    public static void main(String[] args) {
        random r1= new random(10, 15);
        random r3=r1;//this is shallow copy .. if r1 changed then r3 will also change 
        random r2 = new random(r1);
        System.out.println(r1.x+r1.y);
 
        add(r1);
        System.out.println(r1.x + r1.y);      
    }
    static void add(random r){//if i give r1 .. r will point to r1 
        r.x+=10;
        r.y+=10;
    }
    
}
class random{
    int x;
    int y;
    random(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    random(random r)// we can pass a class inside the constructor
    {//THIS IS DEEP COPY
        //if r1 value change then r2 value wont change
        this.x= r.x;
        this.y= r.y;
    }
}