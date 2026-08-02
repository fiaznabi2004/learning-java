package javafirst.prac;
import java.io.*;
import java.util.Scanner;
//bufferedreader
public class part14 {
    public static void main(String[] args) 
    throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String ff = br.readLine();
        System.out.println(ff);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
    }
}
