import java.util.*;

public class Aexhandle
{
    //method-1
    static int c = 0;
    static int a = 0;
    static int b = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        a = sc.nextInt();
        System.out.println("Enter a denominator: ");
        b = sc.nextInt();
        System.out.println("");
        System.out.println("The division looks like: "+a+"/"+b);
        
        if(b==0){
           try
           {
            c=a/b;
           }
           catch(Exception e)
           {
            System.out.println("The quotient is mathematically undefined");
            System.out.println("However the exception ("+e.getMessage()+") has been handled gracefully!");
            System.out.println("The program is operating without any crash");
           } 
        }
        else{
            c=a/b;
            System.out.println("The integer quotient is: "+c);            
        }
        System.out.println("Fun Coding!");
        
        //new twist-1
        try
        {
            int b = 5;
            int a = 0;
            int c = 0;
            for(a =5; a>=0; a--){
                 System.out.println("b ="+b+" a ="+a);
                 if(a==0){
                     break;
                 }
                 c = b/a;
                 System.out.println("c ="+c);
                 System.out.println(" ");
            }
            System.out.println("Division ends");
        }
        catch(Exception e)
        {
            System.out.println("Program crash recovered!\n");
        }
        finally
        {
            System.out.println("Fun Coding!");
        }
        
        //new twist-2 showing that if an exception occurs, break operation will be ignored and exception will be handled first
        try
        {
            int b = 5;
            int a = 0;
            int c = 0;
            for(a =5; a>=0; a--){
                 System.out.println("b ="+b+" a ="+a);
                 if(a==0){
                     c=b/a;
                     break;
                 }
                 c = b/a;
                 System.out.println("c ="+c);
                 System.out.println(" ");
            }
            System.out.println("Division ends");
        }
        catch(Exception e)
        {
            System.out.println("Program crash recovered!\n");
        }
        finally
        {
            System.out.println("Fun Coding!");
        }
    }
}
