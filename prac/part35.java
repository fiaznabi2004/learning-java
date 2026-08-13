package javafirst.prac;

import java.io.Console;

public class part35 {
    public static void main(String[] args) {

        // bankacc
        bankacc b1 = new bankacc(100);
        double x =  b1.calculateYearly();
        System.out.println(x);
        outer2 p4 = new outer2();
        outer2.inner2 p3 = new outer2.inner2(p4);
        outer.inner p1 = new outer.inner();
        outer p2 = new outer();
        p1.fun();
        p3.print();
        p1.print(p2);// we created object and pass it to access the non static variable
        p3.print2();
    }
}

// we can print outer class static vars in case of inner static class as static
// vars are accessed without creating object
// we cant access non static like that as we need an object first
// to access the non static vars we need to create the object first
class outer {
    static int x = 12;
    int y = 111;

    static class inner {

        void fun() {
            System.out.println("Hello");
        }

        void print(outer m)// we need an object to access nonn static class
        {
            System.out.println(x);
            System.out.println(m.y);
        }
    }
}

class outer2 {
    private static int x = 13;// this private is accessed by the nested class
    int y = 12;

    static class inner2 {
        private String name = "Fiaz";

        outer2 xp;

        inner2(outer2 xp) {
            this.xp = xp;
        }

        void print() {
            System.out.println(x);
            System.out.println(xp.y);
        }

        void print2() {
            System.out.println(name);
        }
    }
}

// we can also use static nested class with the access modifier
class bankacc {
    private static double principle;// private is only accessed inside this class and static is needed to access it
                                    // on class level

    bankacc(double principle) {
        bankacc.principle = principle;// static way of defining a static value in constructor
    }

    private static class calculate_interest {// static class can take static vars from outer class
        //as the class is private .. we cant make object of this class as it is not visible from outside 
        private static int year;

        private static double rateinterest(double rate)// only accessed in this class and outer class .. not in the main
        {
            return principle * rate;
        }
    }
    double calculateYearly() {
        calculate_interest.year = 2026;// private static value of anested class is accessed as class level outside the class  .. same with the method
        System.out.print("the year is " + calculate_interest.year);
        Console c = System.console();
        double rate = Double.parseDouble(c.readLine("Enter the rate : "));
        return principle + calculate_interest.rateinterest(rate);// wihout static firt we would have to create an object
    }

}

//if i made the entire class private .. we dont need to make anything inside private as they will already be private as default  due to private class
//that is making class private makes entire thing inside it private
// so if we want we can remove the private typo from inside the calculate_interest class methods and fields
