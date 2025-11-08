import java.lang.System;
import java.util.Scanner;

class DataTypes {
    public static void main(String arg[])
    {
        // boolean rain = true;

        // if(true){
        //     System.out.println("take umbrella");
        // }
        // else{
        //     System.out.print("Enjoy the sunlight");
        // }

        Scanner scan = new Scanner(System.in);

        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.print("number 1 is greater");
        }
        else if(num1 < num2){
            System.out.print("Number 2 is Greater");
        }
        else if(num1 == num2){
            System.out.print("Both Numbers are equal");
        }
    
    
    }
}