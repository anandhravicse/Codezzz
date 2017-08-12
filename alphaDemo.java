import java.io.*;
import java.util.*;


public class alphaDemo
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the letter");
       char c=sc.next().charAt(0);
    
        for(char i='a';i<='z';i++)
            {
                if(c==i)
                {
                System.out.println("the given letter is alphabet");
                }
            }
              
     }
}
