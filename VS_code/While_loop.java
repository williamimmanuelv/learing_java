
import java.util.Scanner;


// import java.util.Random;

class While_loop {

    public static void main(String args[]) {

        // Random ran = new Random();

        // int j = 0;
        // while (j != 5) {
        //     j = ran.nextInt(10);
        //     System.out.println(j);
        //     // j=j+1;
        // }

        // do While

        // int i = 0;

        // do{
        //     System.out.println("hi");
        //     i=i+1;
        // }while(i<=2);

        // Example Question for do while

        //  Get input for variable a. input should be greater than 10;
        // If input is not greater than 10 ask the user to re enter until he types the right input.

        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        do { 
            num1 = scan.nextInt();
        } while (num1 <=10);
    }
}
