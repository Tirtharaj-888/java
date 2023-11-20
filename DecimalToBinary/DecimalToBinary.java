import java.util.*;
public class DecimalToBinary
{
    static int choice, decnum, rem;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> bits = new ArrayList<>();
    
    public static void iterdbconvert(int d1){
        while(d1>0){
            rem = d1%2;
            d1 = d1/2;
            bits.add(rem);
        }
        Collections.reverse(bits);
        System.out.println(decnum+" through iterative binary conversion is: "+bits);
    }
    
    public static void recurdbconvert(int d2){
        if(d2 == 0){
            Collections.reverse(bits);
            System.out.println(decnum+" through recursive binary conversion is: "+bits);
            return;
        }
        else{
            rem = d2%2;
            bits.add(rem);
        }
        recurdbconvert(d2/2);
    }
    
    public static void main(String[] args){
        System.out.println("Enter a decimal number (base-10): ");
        decnum = sc.nextInt();
        System.out.println("Do you prefer iteration or recursion? : ");
        System.out.println("1. Iteration");
        System.out.println("2. Recursion");
        System.out.println();
        System.out.println("Enter 1 or 2");
        choice = sc.nextInt();
        switch(choice){
            case 1: iterdbconvert(decnum);
                    break;
            case 2: recurdbconvert(decnum);
                    break;
        }
        System.out.println();
        System.out.println("Fun Coding!");
    }
}
