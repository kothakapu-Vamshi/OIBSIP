package prog2;
import java.util.Scanner;
public class task3{
    public static void main(String args[])
    {
        int balance=1000,deposit=0,withdraw=0;
        try(Scanner sc=new Scanner(System.in)) {
            while(true)
            {
                
                
                System.out.println("\n*****ATM*****");
                System.out.println("..Choose Operation..");
                System.out.println("1 : Deposit Cash");
                System.out.println("2 : Check balance");
                System.out.println("3 : Withdraw Cash");
                System.out.println("4 : View Transaction Details");
                System.out.println("5 : Exit");
                System.out.print("\nSelect operation that you want to perform : ");
                int n=sc.nextInt();
                
                
                switch(n)
                {
                    case 1 : System.out.print("Enter the amount that is to be deposited : ");
                             deposit=sc.nextInt();
                             balance+=deposit;
                             System.out.println("Rs."+deposit +" has been successfully deposited.");
                             break;
                             
                    case 2 : System.out.println("Your current present balance is : "+balance);
                             break;
                             
                    case 3 : System.out.print("Enter amount that is to be withdrawn : ");
                             withdraw=sc.nextInt();
                             if(balance>=withdraw)
                             {
                                balance-=withdraw;
                                System.out.println("Withdraw has done Successfully! Please collect your cash.");
                             }
                             else 
                             {
                                System.out.println("Insufficient balance in your account!");
                             }
                             break;
                             
                    case 4 : System.out.println("---Transaction Details---");
                             System.out.println("Deposited Amount is: "+ deposit);
                             System.out.println("Withdrawn Amount is: "+withdraw);
                             System.out.println("Balance : "+balance);
                             break;
                             
                    case 5 : System.exit(0);
                    
                    default : System.out.println("Wrong option! Please select the appropriate operation that is to be performed.");
                    
                    
                }
                
            }
            
        }
        
    }
    
}


