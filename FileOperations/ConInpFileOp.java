import java.util.*;
import java.io.*;

public class ConInpFileOp
{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = 0;

        //3 statements to create the file-stream chain from the source code to the file to be written to
        FileWriter fw = new FileWriter("cifo.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        //switch-case construct to demonstrate the difference between InputStreamReader and Scanner functionalities
        System.out.println("Which way do You prefer to input a number?");
        System.out.println("1. InputStreamReader\n2. Scanner");
        int readChoice = sc.nextInt();
        switch (readChoice){
            case 1:
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Enter your number: ");
                num = Integer.parseInt(br.readLine());
                System.out.println("The number entered through InputStreamReader method is: "+num);
                System.out.println("\n");
                break;
            case 2:
                System.out.println("Enter your number: ");
                num = sc.nextInt();
                System.out.println("The number entered through Scanner method is: "+num);
                break;
        }

        //switch-case construct to demonstrate the difference between BufferedWriter and PrintWriter functionalities
        System.out.println("Which way do You prefer to write the input number?");
        System.out.println("1. BufferedWriter\n2. PrintWriter");
        int writeChoice = sc.nextInt();
        switch (writeChoice){
            case 1:
                bw.write(num+"\n");
                System.out.println("The number entered was written to the file using BufferedWriter class");
                break;
            case 2:
                pw.println(num);
                System.out.println("The number entered was written to the file using PrintWriter class");
                break;
        }

        //3 statements to disconnect the file-stream chain from the source code to the file to be written to. This ensures the data 
        //is completely written to the file and that the operating system is relieved.
        pw.close();
        bw.close();
        fw.close();
        System.out.println("Fun Coding!");

    }
}
