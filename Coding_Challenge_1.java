import java.util.Scanner;
class part_1{
    public static void main(String args[])
    {
    // Q1 Get  input for Variable Mark. If mark > 35 print pass. Else Print fail
        // Scanner scan = new Scanner(System.in);
        // int Mark = scan.nextInt();

        // if(Mark >= 35){
        //     System.out.print("pass");
        // }
        // else{
        //     System.out.print("fail");
        // }

    // Q2 Get input for Variable Income. 
    // if Income is greater than 7000 scholorship is available.Else not eligible for scholarship.

        // Scanner scan = new Scanner(System.in);

        // int income = scan.nextInt();

        // if(income > 7000){
        //     System.out.print("Eligible for scholarship");
        // }
        // else{
        //     System.out.print("Not Eligible for scholarship");
        // }
    
    // Q3 Get input for a number and check whether it is devisible by both 3 and 5 or not.
    // if yes then print, the number is devisible by 3 and 5 print the number is not divisible by 3 and 5.

        // Scanner scan = new Scanner(System.in);

        // int number5 = scan.nextInt();

        // if(number5 % 3 == 0 && number5 % 3 == 0){
        //     System.out.print("yes, the number is divisible by 3 and 5");
        // }
        // else{
        //     System.out.print("no, the number is not divisible by 3 and  "  );
        // }

    // Q4 Get input for a number and find it is even or odd number

        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();

        if(number % 2 ==  1){
            System.out.print("the number is odd");
        }
        else{
            System.out.print("the number is even");
        }
    }
}