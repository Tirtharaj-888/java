import java.util.*;

public class blinkMsg
{
    public static void main(String[] args) throws InterruptedException{
        //this code doesn't work in BlueJ console but works in onlinegdb.com online compiler
        for(int i=1;i<=5;i++){
            System.out.print("Calculating...");
            Thread.sleep(1000);   
            System.out.print("\r");
            System.out.print("              ");
            System.out.print("\r");
            Thread.sleep(1000);    
        }
        System.out.print("Fun Coding!");
    }
}
