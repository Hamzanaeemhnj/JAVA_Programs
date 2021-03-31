/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;
/**
HAmza NAeem
 */
public class Quadratic 
{

    
    public static void main(String[] args) 
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println(" Enter the value of a ");
        int a = Sc.nextInt();
        System.out.println(" Enter the value of b ");
        int b = Sc.nextInt();
        System.out.println(" Enter the value of c ");
        int c = Sc.nextInt() ;
        double root1, root2,deter;
        deter = b * b - 4 * a * c;
        if (deter>0) 
        {
            root1 = (-b + Math.sqrt(deter)) / (2 * a);
            root2 = (-b - Math.sqrt(deter)) / (2 * a);

            System.out.println("two real and distinct roots\n" +root1+"and" +root2);
            
        }
        else if (deter==0) 
        {
            root1 = root2 = -b / (2 * a);
            System.out.format("two real and equal roots\n" +root1);
        }
        else if(deter<0)
        {
            double imaginary = Math.sqrt(-deter) / (2 * a);
            System.out.println(" roots are imaginary " +imaginary);
        }
    
    }
    
}
