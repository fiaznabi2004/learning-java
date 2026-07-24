package javafirst;

public class part3 {
    public static void main(String[] args) {
     float f = 8.5123f;
     System.out.println(f); 
     System.out.printf("%.20f\n",f);  //take upto 20 spaces in the decimal 
     // we are seeing that when we take float no and storing bin form of "%.20f" .. we are seeing a lot of numbers
     //instead of the specified number we are getting a value very close to the give number


     //this is the difference .. java is showing the specified value by rounding off  in case of system.out.println
     // but inside the memory .. we are seeing the value being saved in another way

     //all the reason along with how the negetive bit is stored is shown in the copy 


     // type conversion and type promotion
     //implicit conversion
     //byte to int 
     byte b =24;
     int i;
     i=b;
     System.out.println(i);//it will be done widenning conversion

     // char to int 
     char c ='a';
     int i2;
     i2=c;
     System.out.println(i2);
     //it will be convert auto by java as we are setting destination data type which has higher range\


     //explicit conversion
     //need type casting as we are doing narrowing conversion
     int i3 = 24;
     byte b1;
     //b1=i3; not possible as java dont do it auto as its destination data type has short range
     b1 = (byte)i3;
     System.out.println(b1);

     //in some case we have range problem as we convert from high to short range 
     //for exp:
     int i4=300;
     byte b3;
     b3 = (byte)i4;
     System.out.println(b3);
     //will print 44 as 300 is out of range
    //mainly will make 32 bit representation of int and then take first 8 bit 
    //as the byte is 8 bit  it will convert those into decimal and show

  // truncating conversion
  //converting float or double to int
    float f1=3.1234f;
    int i5;
    i5 = (int)f1;
    System.out.println(i5);//will give 3


// type promotion 
// java auto make type range increase to higher range i.e from byte to int in order
//to calculate the expression 

byte b5 = 50;
//b5 = b5*2; 
//  here when we multiply by 50 with 2 we get 100
// this is out of byte range .. so java promotes the byte to int 
// it is done to increae the range and thus we can make the calculation 

//but the problem comes after the calc it is stored in b5 which is byte datatype
// so it is narrow conversion which is not done by java as it is explicit conversion
// so it is a compilation error
// the correct is :

// b5 = (byte)(b5*2);

byte a = 42;
char c2 = 'a';
short s = 1024;
int i6 = 50000;
float f3 = 1.2345f;
double d = .1234;
double result = (f3*a)+(i6/c2)-(d*s);

//f3*a -->float
//i6/c2 -->int
//d*s -->double

//adding these 3 we will get double

// so the answer is double

System.out.println((f3*a)+"+"+(i6/c2)+"-"+(d*s));
System.out.println("result" + result);
}
}
