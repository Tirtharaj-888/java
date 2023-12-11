import java.util.*;

public class multi5
{
    public static void main(String[] args){
        System.out.println("Enter the number of set(s): ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int i = 0, m = 0, j = 0;
        for(m = 5, i = 1; i<=s; i++, m=m+5){
            System.out.println("i = "+i+" m = "+m); // for help in dry-run
            for(j = 1; j<=5; j++){
                System.out.println(m+" * "+j+" = "+(m*j));
            }
            System.out.println("\n");
        }
        System.out.println("Fun Coding!");
    }
}
