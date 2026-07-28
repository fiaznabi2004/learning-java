package javafirst.prac;

public class part7 {
    public static void main(String[] args) {
        int k = 0;
       // doing in while loop
        // while (k<10) {
       //     System.out.println(k);
       //     k++;//prints upto 9
       // }

       //doing in forloop
       //for(int i=0;i<10;i++)
       //{
       //   System.out.print(i);
       //}
      
       //doing it in do - while
       //do{
       // System.out.print(k);
       // k++;
       //}while(k<10);
       
//in case of while loop to do the work in a single statement
// while(k++<10)
// {
    //System.out.print(k); // here we print from 1 to 10
    //System.out.print(++k);//2,4,6,8,10
    //System.out.print(k++);//1,3,5,7,9
// }

while (k<0) {
    System.out.println("fiaz");
}
//this will check the condition , then will print


do {
    System.out.println("fiaz");//this will print and then check the condition
} while (k<0);


//comma seperated variation
//for(int i =0,j=0;i<10 && j<10;i++,j++){}

for(int i =1,j=1;i<=10;i++,j++)
{
    System.out.print(i*j+"\t");
}
//if we want we can use multiple variable for it like .. 
// for(int i=1,j=1,k=1,l=1,m=1.....,i<10 && j<10..... ; i++,j++,k++ .....){}



// as always there is a nested option for it 
//for(int i =0;i<10;i++)
//    for (int j = 0; j < 10; j++) {
        //here for every iteration over i , we get 10 iteration over j,
        // so for every iteration over i from 1 to 10.. we get 100(10*10) iterations over j
//    }

// practice with pattern printing


//jump statements
for(int i=0;i<8;i++)
{
    if (i == 5) {
       // break;
      // continue;
    }
    System.out.println(i);
}
// here after 5 we cant get any more printing
//break statement breaks the loop at 5 that is 1 2 3 4
//continue satatement prints upto given condition but ignore 5 i.e 1,2,3,4,6,7


}
}


//in case of writing a loop or conditional statement without curly bracket
// there can be only one statement in range of that forloop or while loop
//if more than one .. then  next statements after the first statement will be out of the loop range