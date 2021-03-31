
package javaapplication3;

import java.util.Scanner;

/*Hamza Naeem*/
public class JavaApplication3 {

    
    public static void main(String[] args) 
    {
        int num;
        int item=99;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter number of packages bought: ");
        num=Sc.nextInt();
        if(num==1)
        {
      
            System.out.println("Amount payable: " +item);
        
         }
        else if(num>=10 && num<=19)
        {
           System.out.println("discount 20% ");
           System.out.println("WAS : " +num*item);
           int disc=20;
           int s=100-disc;
           int amount=(s*num*item)/100;
           System.out.println("NOW : " +amount);
            
        }
        else if(num>=20 && num<=49)
        {
           System.out.println("discount 30% ");
           System.out.println("WAS : " +num*item);
           int disc=30;
           int s=100-disc;
           int amount=(s*num*item)/100;
           System.out.println("NOW : " +amount);
            
        }
        else if(num>=50 && num<=99)
        {
           System.out.println("discount 40% ");
           System.out.println("WAS : " +num*item);
           int disc=40;
           int s=100-disc;
           int amount=(s*num*item)/100;
           System.out.println("NOW : " +amount);
            
        }
        else
        {
           System.out.println("discount 50% ");
           System.out.println("WAS : " +num*item);
           int disc=50;
           int s=100-disc;
           int amount=(s*num*item)/100;
           System.out.println("NOW : " +amount);
            
        }
    }
    
}
