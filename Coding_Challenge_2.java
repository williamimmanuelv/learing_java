import java.util.Scanner;

class part_2 {

    public static void main(String arg[]) {
        // Q1 What is the score in a game?
        //  - if the score is less then 50, print "you need to improve."
        // if the score is betwee 50 and 70 (inclusive), print "Good job"
        // If the score is greater than 70, print "Excellent performance"

        // Scanner scan = new Scanner(System.in);
        // int score = scan.nextInt();
        // if( score < 50 ){
        //     System.out.print("you need to improve");
        // }
        // else if (score >= 50 && score <= 70){
        //     System.out.print("Good job");
        // }
        // else if(score > 70){
        //     System.out.print("Excllent performance");
        // }

        // Q2 get input for five subjects marks. Add all of it, and find average.
        // If average mark is less than 35. Print " Additional class is required"
        // else print "you are good to go"
        
        // Scanner scan = new Scanner(System.in);

        // int sub1 = scan.nextInt();
        // int sub2 = scan.nextInt();
        // int sub3 = scan.nextInt();
        // int sub4 = scan.nextInt();
        // int sub5 = scan.nextInt();

        // int avg = sub1 + sub2 + sub3 + sub4 + sub5;

        // if (avg / 5 < 35) {
        //     System.out.print("Additional class is required");
        // } else {
        //     System.out.print("you are good to go");
        // }

    // Q3 what is the color of the traffic light?
    //  - if the answer is "red" print "stop"
    //  - if the answer is "yellow" Print "Get ready"
    //  - if the answer is " green" print "go"

        // Scanner scan = new Scanner(System.in);

        // String color = scan.nextLine();

        // if ( color.equals("red")){
        //     System.out.print("stop");
        // }
        // else if(color.equals("yellow")){
        //     System.out.print("Get ready");
        // }
        // else{
        //     System.out.print("Go");
        // }

    // Q4 get input for salary and age.
    // if salary greater than or equal to 20000 or age less than or equal to 25,
    // get input for required loan amout. if nor print "you are not eligible for loan"
    // if required loan amout is less than or equal to 50,000 print "you are eligible for loan"
    // if it is greater than 50,000 print maximum loan amout is 50,000

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int Salary = scan.nextInt();
        System.out.print("Enter your Age: ");
        int Age = scan.nextInt();

        if( Salary >= 20000 || Age >= 25)
        {
            System.out.println("you are eligible for loan.");
            System.out.print("Enter loan Amount: ");
            int loanAmount = scan.nextInt();
            if( loanAmount <= 50000){
                System.out.print("Loan Available.");
            }
            else if ( loanAmount > 50000){
                System.out.print("Maximum loan amount is 50000.");
            }
        }
        else
        {
            System.out.print("You are not eligible.");
        }
        
    }
}
