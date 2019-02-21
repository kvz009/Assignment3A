/*
Kenneth VanZuiden, Assignment 3A
CS121-100 Spring 2019
Feb 21, 2019
This program is to calculate average MPG using a Sentinel-Controlled While Loop WITH input validation. (With UML/Pseudocode)
 */
package assignment3b;
import java.util.Scanner;


public class Assignment3B {


    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        int Miles = 0;                                       //Where all the nessary varibles are.
        int Gallons;
        int TotalMiles = 0;
        int TotalGallons = 0;
        
        
        System.out.printf("%s%n","Hello! This Program Calculates MPG and Average MPG of Your Trips!");
        
        System.out.printf("%n%s%n%n", "Please Enter The Data To Calculate! To Exit And Get Average MPG, Enter '-1' For Miles.");
        
        
        
        while(Miles != -1){                    //while loop is broken with just a -1.
            
            
            Miles = 0;                       //Looking later, Miles is reset to 0 becasue Miles was set to -2 to get out of "Gallons" loop.
            
            
            
            System.out.print("Miles Driven: ");      //Asks for Miles.
            Miles = Input.nextInt();     
            
            if(Miles < -1){                         //Input Validation for Miles. Checking if Miles is less than -1.
                while(Miles < -1){
                    
                    System.out.println("Wrong Input! Try again.");
                    System.out.print("Miles Driven: ");        
                    Miles = Input.nextInt();   
                }
            }
            
            
            
            
            while(Miles > -1){                     //This is the gallons loop. Will skip over if Miles is -1 and miles can't be > -1 due to Input Validation.
                
                System.out.print("Gallons Used: ");                    
                Gallons = Input.nextInt();
                
                
                
                if(Gallons <= 0){                 //Input Validation for gallons. Checking if gallons is > 0.
                    while(Gallons <= 0){
                        System.out.println("Wrong Input");
                        System.out.print("Gallons Used: ");
                        Gallons = Input.nextInt();
                        
}
}
                System.out.printf("%s%.2f%n%s%n", "MPG:          ", (double) Miles / Gallons, "---");   //Calculates and prints MPG.
            
                TotalMiles = TotalMiles + Miles;                 //Keeps track of total miles.
            
                Miles = -2;                                //This is to escape the "gallons" loop but not used in final calculation. 
            
                TotalGallons = TotalGallons + Gallons;         //Keeps track of total gallons.
            
            
            

}
}
        System.out.printf("%s%n%s%.2f%n", "***", "Average MPG: ", (double) TotalMiles/TotalGallons);    //When the user is done, Calculates and prints out Average MPG.
        
        
              
        
}
    
}
