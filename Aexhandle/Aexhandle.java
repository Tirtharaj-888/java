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
    }
}
