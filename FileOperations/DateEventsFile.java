import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*;

public class DateEventsFile
{
    public static void main(String[] args) throws IOException{
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, YYYY");
        
        String[] dateset = {
            df.format(new Date(47,7,15)),
            df.format(new Date(93,10,01)),
            df.format(new Date(94,3,27)),
            df.format(new Date(115,8,25))
        };
        
        String[] globalEvents = {
            "Indian Independence",
            "Establishment of European Union",
            "End of Apartheid in South Africa",
            "UN's Adoption of SDGs"
        };
        
        String filename = "ige.txt";
        
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        int gel = globalEvents.length;
        for(int i = 0; i<gel; i++){
            bw.write(globalEvents[i]+" on "+dateset[i].substring(0,2)+"th"+dateset[i].substring(2));
            bw.newLine();
        }
        pw.close();
    }
}
