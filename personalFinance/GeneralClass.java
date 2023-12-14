import perFin.*;

public class GeneralClass
{
    public static void main(String[] args){
        double si = PerFinFunctions.simpInt(100,10,5);
        System.out.println("The interest earned is: Rs."+si);
        System.out.println("\n");
        double ci = PerFinFunctions.compInt(100,10,5);
        System.out.println("The interest earned is: Rs."+ci);
    }
}
