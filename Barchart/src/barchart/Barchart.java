
package barchart;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Barchart 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int sales1, sales2, sales3, sales4, sales5;

      
        Scanner Sc = new Scanner(System.in);  

       
        System.out.print("Enter today's sales for store 1: ");
        sales1 = Sc.nextInt();

        System.out.print("Enter today's sales for store 2: ");
        sales2 = Sc.nextInt();

        System.out.print("Enter today's sales for store 3: ");
        sales3 = Sc.nextInt();

        System.out.print("Enter today's sales for store 4: ");
        sales4 = Sc.nextInt();

        System.out.print("Enter today's sales for store 5: ");
        sales5 = Sc.nextInt();

        
        System.out.println("\nSALES BAR CHART");

        System.out.print("\nStore 1: ");        
        for (int num = 0; num < sales1; num += 100)
        {
            System.out.print("*");
        }

        System.out.print("\nStore 2: ");
        for (int num = 0; num < sales2; num += 100)
        {
            System.out.print("*");
        }

        System.out.print("\nStore 3: ");
        for (int num = 0; num < sales3; num += 100)
        {
            System.out.print("*");
        }

        System.out.print("\nStore 4: ");
        for (int num = 0; num < sales4; num += 100)
        {
            System.out.print("*");
        }

        System.out.print("\nStore 5: ");
        for (int num = 0; num < sales5; num += 100)
        {
            System.out.print("*");
        } 
    }
    
}
