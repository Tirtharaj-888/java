
public class NestLoops
{
    public static void main(String[] args){
        int j=12;
        
        // Nested for-loop with inner break
        for(int k = 1; k<=3; k++){
            System.out.println("k ="+k);
            for(int l = 1; l<=3; l++){
                System.out.println(l);
                if(l==2){
                    break;
                }
                System.out.println(l+"th inner iteration done");
            }
            System.out.println(k+"th outer iteration done");
        }
            
        // Nested do-while with inner continue
        do{
            j=j-1;
            System.out.println("j="+j);
            int i=10;
            do
            {
                i=i-1;
                if(i<=3)
                {
                continue;
            }
            System.out.println(i);
        }while(i>0);
        System.out.println(" ");
        }while(j>0);
        
        
    
    }
}
