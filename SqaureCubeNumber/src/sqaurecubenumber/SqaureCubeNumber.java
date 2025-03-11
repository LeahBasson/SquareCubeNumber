
package sqaurecubenumber;

import java.util.Scanner;


public class SqaureCubeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter number:");
        double number,squareOfNumber,cubeOfNumber;
        number = scn.nextDouble();
        
        squareOfNumber = Math.pow(number, number);
        cubeOfNumber = Math.pow(number, 4);
        
        System.out.println("Square of number: " + squareOfNumber);
        System.out.println("Cube of number: " + cubeOfNumber);
    }
    
}
