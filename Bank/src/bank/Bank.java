/*
HAmza NAeem
 */
package bank;
import java.util.Scanner;
public class Bank 
{

    
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        int balance;
        int S,C;
        long Ac;
        int minbalance;
        int Type;
        System.out.println("Enter Account Number : ");
        Ac=Sc.nextLong();
        System.out.println("Press 1 for Savings account /n Press 2 for Current Account : ");
        Type=Sc.nextInt();
        
        switch(Type)
        {    
            case 1:
                System.out.println("Wellcome to your Savings Account ");
                System.out.println("Enter your balance");
                balance=Sc.nextInt();
                minbalance=1000;
                
                if(balance<minbalance)
                {
                       System.out.println("Your balnce is less than minbalance requires\n You are being charged 10$\n please recharge to earn interest");
                       balance=balance-10;
                       System.out.println("Account number "+Ac);
                        System.out.println("Account Type "+Type);
                       System.out.println("Your balance is : "+balance+"$");
                }
                else if(balance>=minbalance)
                {   
                   System.out.println("Congratulations You get 4% interest ");
                   int interest;
                   interest=balance*4/100;
                   balance=balance+interest;
                   System.out.println("Account number "+Ac);
                   System.out.println("Account Type "+Type);
                   System.out.println("Your current balance : "+balance+"$");
                }
                break;
            case 2:
                System.out.println("Wellcome to your Current Account ");
                System.out.println("Enter balance");
                balance=Sc.nextInt();
                minbalance=2000;
                if(balance<minbalance)
                {
                       System.out.println("Your balnce is less than minbalance requires\n You are being charged 25$\n please recharge to earn interest");
                       balance=balance-25;
                       System.out.println("Account number "+Ac);
                       System.out.println("Account Type "+Type);
                       System.out.println("Your balance is : "+balance+"$");
                }
                else if(balance>=minbalance)
                {   
                   System.out.println("Congratulations You get 3% interest ");
                   int interest;
                   interest=balance*3/100;
                   balance=balance+interest;
                   System.out.println("Account number "+Ac);
                   System.out.println("Account Type "+Type);
                   System.out.println("Your current balance : "+balance+"$");
                }
                else if(balance>5000)
                {   
                   System.out.println("Congratulations You get 5% interest ");
                   int interest;
                   interest=balance*5/100;
                   balance=balance+interest;
                   System.out.println("Account number "+Ac);
                   System.out.println("Account Type "+Type);
                   System.out.println("Your current balance : "+balance+"$");
                }
                break;
            }
    }
}