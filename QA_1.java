import java.lang.System;
import java.util.Scanner;

class QA{
    public static void main(String args[])
    {
    // // Get input for variable: Name and age, print
    //     Scanner details = new Scanner(System.in);

    //     String name = details.nextLine();

    //     // System.out.print(name+age);
    //     int age = details.nextInt();

    // // 2 -get input for variable: Name,Age and Address Print it.
    
    //     details.nextLine();
    //     String Address = details.nextLine();

    //     System.out.print(name + Address +  age );

    // 3 - Get input for 3 integer variables: a,b and c. Now multiply all variables and store it a d.
    // Now add all variables and store it in e. Now divide d by e.

        // Scanner operators = new Scanner(System.in);

        // int a = operators.nextInt();
        // int b = operators.nextInt();
        // int c = operators.nextInt();

        // int d = a * b * c;
        // int e = a + b + c;

        // System.out.print(d/e);

        // 4 - Get input for 3 variables :Name,Score,department.
        // let the user enter the score for 100 marks,you convert it for 10 and print it.

        Scanner input = new Scanner(System.in);

        String Name = input.nextLine();
        double Score = input.nextInt();
        input.nextLine();
        String department = input.nextLine();

        System.out.println("Name: " + Name);
        System.out.println("Scrore: " + Score / 10 + "/10");
        System.out.println("Department: " + department );

    }
}