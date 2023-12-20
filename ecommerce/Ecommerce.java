import java.util.*;

public class Ecommerce
{
   static int ni = 0; //no. of items in cart
   static int dba = 0; //digital balance amount
   static String nb; //name of buyer
   static long phNo; //phone number
   static int nB = 0, nA = 0, nT = 0; //no. of books, appliances, toys
   static int pB = 0, pA = 0, pT = 0; //price of books, appliances, toys
   static int totalPrice = 0;
   static Scanner sc = new Scanner(System.in);
   
   public static void initializer(){
       System.out.println("Enter Your name: ");
       nb = sc.nextLine();
       System.out.println("\nEnter Your mobile number: ");
       phNo = sc.nextLong();
       System.out.println("\nAdd balance to Your wallet: \n+250\t+500\t+1000\tOther");
       int dba = sc.nextInt();
       System.out.println("\nShop from the following categories \nBooks\tAppliances\tToys");
       System.out.println("\nNo. of books to be added to cart: ");
       nB=sc.nextInt();
       System.out.println("No. of appliances to be added to cart: ");
       nA=sc.nextInt();
       System.out.println("No. of toys to be added to cart: ");
       nT=sc.nextInt();
       ni = nA + nB + nT;
       System.out.println("\nName: "+nb+"\nMobile Number: "+phNo+"\nWallet Balance: "+dba+"\nNo. of items in cart: "+ni);
   }
   
   public static void pricing(){
       int price_books = 0, price_appl = 0, price_toys = 0, pB_Final = 0, pA_Final = 0, pT_Final = 0, dc = 0;
       System.out.println("\nEnter the prices of "+nB+" books:");
       for(int i = 1;i<=nB;i++){
           System.out.println("Book "+i+":");
           price_books = sc.nextInt();
           pB = pB + price_books;
           System.out.println((nB-i)+" left");
       }
       if(pB<499){
            pB_Final=pB+40;
            dc=dc+40;
       }
       else{
           pB_Final=pB+0;
           System.out.println("Books category qualifies for FREE delivery!");
       }
       
       System.out.println("\nEnter the prices of "+nA+" appliances:");
       for(int i = 1;i<=nA;i++){
           System.out.println("Appliance "+i+":");
           price_appl = sc.nextInt();
           pA = pA + price_appl;
           System.out.println((nA-i)+" left");
       }
       if(pA<499){
            pA_Final=pA+40;
            dc=dc+40;
       }
       else{
           pA_Final=pA+0;
           System.out.println("Appliances category qualifies for FREE delivery!");
       }
       
       System.out.println("\nEnter the prices of "+nT+" toys:");
       for(int i = 1;i<=nT;i++){
           System.out.println("Toy "+i+":");
           price_toys = sc.nextInt();
           pT = pT + price_toys;
           System.out.println((nT-i)+" left");
       }
       if(pT<499){
            pT_Final=pT+40;
            dc=dc+40;
       }
       else{
           pT_Final=pT+0;
           System.out.println("Toys category qualifies for FREE delivery!");
       }
       
       totalPrice = pB_Final + pA_Final + pA_Final;
       dba = dba - totalPrice;
       System.out.println("Order Total: "+totalPrice+"\nDelivery Charges (if any): "+dc);
   }
   
   public static void main(String[] args){
       Ecommerce ob = new Ecommerce();
       ob.initializer();
       ob.pricing();
   }
   
   
}
