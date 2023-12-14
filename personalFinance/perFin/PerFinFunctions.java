package perFin;
import java.util.*;

public class PerFinFunctions
{
    static double p, r, t, si, ci, a;
    
    public static double simpInt(double p, double r, double t){
        si = (p*r*t)/100.0;
        System.out.println("The amount earned on "+p+" is: "+(p+si));
        return si;
    }
    
    public static double compInt(double p, double r, double t){
        a = p*(Math.pow((1+(r/100)),t));
        ci = a - p;
        System.out.println("The amount earned on "+p+" is: "+(p+ci));
        return ci;
    }
}
