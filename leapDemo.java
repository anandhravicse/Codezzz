import java.io.*;
import java.util.*;

public class leapDemo
{

     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if((year%400==0)||((year%4==0)&&(year%100!=0)))
          {
            System.out.println("the given year is leap year");
          }
          else
           {
               System.out.println("the given year is not leap year");
           } 
     }
}
