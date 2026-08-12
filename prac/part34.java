package javafirst.prac;

public class part34 {
    //difference between  ==  and equals()
public static void main(String[] args){
Integer a= 200;
Integer y=200;
// Small integers (-128 to 127) are extremely common in code, so Java
// pre-creates and reuses them to save memory and avoid constantly creating new
// objects — similar in spirit to string interning.
//so upto 128 all the integer objects gives true with Integer and ==
int x=100;
int b =100;

//== checks the references in case of non primitive
// equals checks values 
System.out.println( a == y);
System.out.println(a.intValue() == y.intValue());
System.out.println( x == b);

//but 
System.out.println(a.equals(y));
//"yes" (the literal in your code) is stored in the String pool — a special memory area for literals.
//x, however, comes from c.readLine(),
// which reads input from the console and builds a brand-new String object on the heap at runtime
//This new object is not placed in the string pool automatically.`
/*
 * So even though x and "yes" hold the exact same characters, they are two
 * different objects in memory:
 * 
 * "yes" (literal) → lives in String pool → address A
 * x (from input) → lives in heap (new obj) → address B
 * 
 * == compares addresses, not content, so A != B → false.
 * 
 * never use == to compare String or wrapper object values — only use it if you
 * genuinely want to check whether two references point to the exact same object
 * in memory. For comparing actual content/value, always use .equals().
 * 
 * 
 * 
 * 
 * 
 * Java's autoboxing exists because of a specific historical design choice: Java
 * generics only work with reference types, and Java kept primitives as a
 * separate, non-object category for performance reasons (unlike C# or Python).
 * That combination — primitives excluded from the object system + generics
 * requiring objects — is what makes autoboxing/unboxing a necessary bridge in
 * Java, more so than in most other mainstream languages.
 */
}
}


