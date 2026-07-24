package javafirst;

/**
 * part2
 */
public class part2 {

    public static void main(String[] args) {
        //integer int , byte , short , long
         int i= 10;
        byte b=2;//it is a  decimal number
        byte binary = 0b01;//it is a binary number as it has 0b as first number 0 and 1
        byte octal = 04;//this is a octal number as it has 0 as first number 0-7
        byte hexadecimal = 0X5;// this is a hexa decimal number 0-9 and A,B,C,D,E,F
        long l = 100_00_00_000;//underscore is used for better understanding of the value 
        long l1 = 10_00_00______00_000L;// real understanding of the value  and we used L to understand that it is a long value
//it will ignore the underscore no matter how many times we give them
//but it will give error if we give before or after decimal and whole value
        short s = 1000;
        System.out.println(binary+"\n"+octal+"\n"+hexadecimal+"\n"+l+"\n"+l1);
        //float --> double float
        float f= 156.65f;//f to define float
        double d = 1000.0000001;

        // character 
        char a = 'c';// c-> integer -> byte -> store
        //boolean
        boolean bool = true;
        System.out.println("INteger values are -> " + b + "," + s + "," + i +"," + l) ;
        System.out.println("float values "+f+","+d);
        System.out.println("character "+a);
        System.out.println("boolean "+bool);
    }
}

//if C:{ if we use break c; then all the range of C will be ignored}