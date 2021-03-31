
package speed;
import java.util.Scanner;
/**
HAmza NAeem
 */
public class Speed 
{

    
    public static void main(String[] args) 
    {
    Scanner Sc=new Scanner(System.in);
        
        int distance;
        String Medium;
        float Time;
        int Airspeed=1100;
        int Waterspeed=4900;
        int Steelspeed=16400;
        System.out.println("ENTER Medium : ");
        Medium=Sc.next();
        
        if(Medium.equals("Air") ||  Medium.equals("AIR") || Medium.equals("air"))
                {
                    System.out.print("Enter Distance in meters : ");
                    distance=Sc.nextInt();
                    Time=(float) distance/Airspeed;
                    
                    System.out.println("Distance is : " +distance+" m");
                    System.out.print("Time taken is: " +Time+" mps");
                    System.out.println("\n");
                }
        
        else if(Medium.equals("Water") ||  Medium.equals("WATER") || Medium.equals("water"))
                {
                    System.out.print("Enter Distance in meters : ");
                    distance=Sc.nextInt();
                    Time=(float) distance/Waterspeed;
                    System.out.println("Distance is : " +distance+" m");
                    
                    System.out.println("Time taken is: " +Time+" mps");
                    System.out.println("\n");
                }
 
        else if(Medium.equals("Steel") ||  Medium.equals("STEEL")|| Medium.equals("steel"))
                {
                    System.out.print("Enter Distance in meters : ");
                    distance=Sc.nextInt();
                    Time=(float) distance/Steelspeed;
                    System.out.println("Distance is : " +distance+" m");
                    System.out.println("Time taken is: " +Time+" mps");
                    System.out.println("\n");
                }
 
    }
    
    
        
        
        
        
        
        
        
        

