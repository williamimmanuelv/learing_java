import java.util.Scanner;
class DataTypes {

    public static void main(String arg[]) {
        // boolean rain = true;

        // if(true){
        //     System.out.println("take umbrella");
        // }
        // else{
        //     System.out.print("Enjoy the sunlight");
        // }
        // Scanner scan = new Scanner(System.in);
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();
        // if(num1 > num2){
        //     System.out.print("number 1 is greater");
        // }
        // else if(num1 < num2){
        //     System.out.print("Number 2 is Greater");
        // }
        // else if(num1 == num2){
        //     System.out.print("Both Numbers are equal");
        // }
        // String s1 = new String("apple");
        // String s2 = new String("apple");
        // String s3 = "orange";
        // String s4 = "orange";
        // System.out.println(s1.equals(s2));
        // System.out.print(s3 == s4);

        // // practice
        // String a = "one";
        // String b = "one";
        // String c = b;

        // System.out.print(a==c);

        // String a = "one";
        // String b = new String("one");
        // String c = b;
        // System.out.print(a==c);
        

        // question 1
        // Get a input from user, for the variabl called RCB. 
        // If RCB wins print ("Ee sala cup Namdhey"), if RCB loose print ("cup illa")

        // Scanner scan = new Scanner(System.in);
        // String RCB = scan.nextLine();

        // if(RCB.equals("win")){
        //     System.out.print("Ee sala cup Namdhey");
        // }
        // else if(RCB.equals("loose")){
        //     System.out.print("cup illa");
        // }

        //  question 2
        //  Get a input from user, for the variable called meghana
        // if meghana is "dead" Print("Surya meets Ramya")
        // else Print("surya weds meghaana")

        Scanner scan = new Scanner(System.in);
        String meghana = scan.nextLine();

        if(meghana.equals("dead")){
            System.out.print("Surya meets Ramya");
        }
        else{
            System.out.print("surya weds meghana");
        }
        
    }
}
