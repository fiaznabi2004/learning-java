package javafirst.prac;

import java.io.Console;

public class part9 {
    public static void main(String[] args) {
    //    int[] fiaz = new int [4];
       // fiaz[0]=011;     //it is seen as octal number //to print as 011 we need it as string
       // fiaz[1]=101;   //we can set value like this
       // fiaz[2]=111;
       // System.out.println(fiaz[0]+","+fiaz[1]+","+fiaz[2]);
       // System.out.println(fiaz.length);
  
    //   int x=100;
    //   for (int i = 0; i < fiaz.length; i++) {
    //    fiaz[i]=x;
    //    x++;
    //   }
    //   for (int i = 0; i < fiaz.length; i++) {
    //    System.out.println(fiaz[i]+'\n');
    //   }
// Since fiaz[i] is an int, the expression fiaz[i] + '\n' becomes integer
// addition, not string concatenation. Java adds the numeric value of fiaz[i] to 10
//\n is added as int and println is making it go through the process


//the above is a one dimensional array

//for 2 dimensional array

//Console c = System.console();
//int[][] fiaz = new int [3][3];
//for (int i = 0; i < fiaz.length; i++) {
//    for (int j = 0; j < fiaz[i].length; j++) {
//        int x = Integer.parseInt(c.readLine());
//        fiaz[i][j]=x;
//    }
//}
//   
//for (int i = 0; i < fiaz.length; i++) {
//    for (int j = 0; j < fiaz[i].length; j++) {
//        System.out.print(fiaz[i][j]+" ");
//    }
//    System.out.println();
//}

//we can declare diff size of row inside the array(conceptual)
//or diff no of cols inside a row

int[][] fiaz = new int [3][];//row is compulsory to give
//col is up to u

//assigning diff col to rows
fiaz[0] = new int[2];
fiaz[1] = new int [3];
fiaz[2] = new int[4];

Console c = System.console();
for(int i=0;i<fiaz.length;i++)
{
    for (int j = 0; j < fiaz[i].length; j++) {
        int x = Integer.parseInt(c.readLine());
        fiaz[i][j]=x;
    }
}
for (int i = 0; i < fiaz.length; i++) {
    for (int j = 0; j < fiaz[i].length; j++) {
      System.out.print(fiaz[i][j] + "\t");//if if gave \t or \n inside ' ' it will read it as character and add it with the result
    }
    System.out.println();
}
    }
}
