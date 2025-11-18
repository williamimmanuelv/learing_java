import java.util.Scanner;
public class School{
  String passORfail(int mark){
    if (mark >= 35) {
        return "pass";
    }
    else{
      return "fail";
    }
    
  }
  public static void main(String[] args) {
    // Create a class called "School" with main function
    // Create a function called passORfail which should return the string "Pass/fail"
    // Inside Main function get integer input from user for total mark.
    // Pass that input to the passORfail function and let the function decide whether student is passORfail
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();

    School getMark = new School();

    String ans = getMark.passORfail(input);

    System.out.print(ans);

  }
}