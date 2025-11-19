import java.util.Scanner;
public class Find {
  String evenORodd(int num){
    if(num % 2 == 0){
      return "The given number is EVEN";
    }
    else{
      return "The given number is ODD";
    }
  }
  public static void main(String[] args) {
    // Create a class called "Find" with main function
    // Create a function called evenorodd with integer parameter called int num
    // Inside Main function get integer input from user
    // Pass that input to the evenorodd function and let the function decide whether the number is even or odd
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();

    Find oRe = new Find();
    String ans = oRe.evenORodd(input);
    System.out.print(ans);
  }
}
