import java.util.*;

public class Quiz
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("What is the capital of India?");
        String answer1 = sc.nextLine();
        if(answer1.equals("New Delhi") || answer1.equals("New delhi") || answer1.equals("new delhi")){
            System.out.println("Correct!");
            score += 1;
        }
        else{
            System.out.println("Incorrect!");
            score -= 1;
        }
        System.out.println(" ");
        
        System.out.println("Who founded DMart?");
        String answer2 = sc.nextLine();
        if(answer2.equals("Radhakrishnan Damani") || answer2.equals("R Damani") || answer2.equals("R.Damani") || answer2.equals("radhakrishnan damani")){
            System.out.println("Correct!");
            score += 1;
        }
        else{
            System.out.println("Incorrect!");
            score -= 1;
        }
        System.out.println(" ");
        
        System.out.println("What is the eighth power of 2?");
        int answer3 = sc.nextInt();
        if(answer3 == 256){
            System.out.println("Correct!");
            score += 1;
        }
        else{
            System.out.println("Incorrect!");
            score -= 1;
        }
        System.out.println(" ");
        
        System.out.println("Thanks for participating! Your score is = "+score);
        System.out.println("Fun Coding!");
    }
}
