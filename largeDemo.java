import java.io.*;
import java.util.*;


public class largeDemo
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the  first number");
       int first=sc.nextInt();
       System.out.println("Enter the  second number");
       int second=sc.nextInt();
       System.out.println("Enter the  third number");
       int third=sc.nextInt();
       if((first>second)&&(first>third))
          {
              System.out.println(first+"is greater than"+second+"and"+third);
          }
        else if(second>third)
           {
               System.out.println(second+"is greater than"+third+"and"+first);
           }
           else
              System.out.println(third+"is greater than"+first+"and"+second);
     }
}
