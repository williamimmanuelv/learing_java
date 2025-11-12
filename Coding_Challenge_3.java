// import java.util.Scanner;


class part_3{
    public static void main ( String arg[]){
    // Question 1 
    // Get input for variable a and b and print the number from a to b

    // Scanner scan = new Scanner(System.in);
    // System.out.print("Enter A : ");
    // int a = scan.nextInt();
    // System.out.print("Enter b : ");
    // int b = scan.nextInt();

    // for (int i=a; i<=b; i=i+1){
    //     System.out.println(i);
    // }

    // Q2 
    // Print even number between 1 to 10 Using for loop and if else

    // for( int i=1; i<=10; i=i+1){
    //     if( i % 2 == 0){
    //         System.out.println("Even Number : " + i);
    //     }
    // }
    
    //  Q3 Count the number of odd number from 1 to 10

    // int j = 0;

    // for(int i=1; i<=10; i=i+1){
    //     if(i%2 == 1){
    //         j = j+1;
    //     }
    // }
    // System.out.print(j);

    
    // //  Q4 Count the number of even number from 1 to 
    
    // int j = 0;
    // for(int i=1; i<=10; i=i+1){
    //     if(i % 2 == 1){
    //         j = j+1;
    //     }
    // }

    // System.out.print(j);

    // Q3
    // Print the number which are divisible by both 3 and 5 Range 1 to 100

    for( int i = 1; i<=100; i=i+1){
        if(i%3 == 0 && i%5 == 0){
            System.out.println(i);
        }
    }


    }
}