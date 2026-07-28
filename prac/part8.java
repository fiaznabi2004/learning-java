package javafirst.prac;

public class part8 {
    public static void main(String[] args) {
     
        // we can give name to each loop using label
       
       
        // outer: for(int i=1;i<=10;i++)
       // {
       // inner: for(int j=1;j<=i;j++)
       //         {
       //         System.out.print("*");
       //         if(j>=5)
       //         {
       //             break outer;
       //             //continue outer;
       //         }
       //     }
       //     System.out.print("\n");
       // }
    
    
    //code blocks

    first: {
        second: {
            third: {
                System.out.println("hello");
                break first;
            }
        }
    }
    //although it looks like a normal code .. first we go inside and check first
    //then we go and ckeck second and then we check third
    //in third we go and console the hello and then we see break first;

    //so according toi that we go straight outside the block first 
    //this is how labeling helps us to give control while being inside a block
    }
}
//green fiaz

//label ->giving name to the loop or block which gives us control of that block while inside the block
//we can stay inside the nested loop and still can control the breaking of any of the outer loop from inside


//not only loop we can exit from any codeblock 
// codeblock -> anything inside  curly brackets {..} is code block

// we can name a codeblock  fiaz: {...} and can control the braking point from the inside