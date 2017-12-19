/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numdigits;
import java.util.Scanner;
/**
 *
 * @author lumat8093
 */
public class NumDigits {

    /**
     * @param args the command line arguments
     */
     static int d = 0;
     public static int digits(double x){   
              
         if(x<9){
            return d;
        }else {
            return (digits(x/10));
            
        }
        
        //return digits ;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:   ");
        double num = input.nextDouble();
        System.out.println("Number of digits:   " + digits(num));     
        input.close();       
    }   
}
