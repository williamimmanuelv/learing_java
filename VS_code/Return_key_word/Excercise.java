
public class Excercise {

    // int sum( int num1, int num2){
    //     return num1 + num2;
    // }

    
    // Create a function called getname(), which should return your name,
    // Create a function called getphone() which should reuturn you the phone number.

    String getName(){
        return "william";
    }
    int getPhone(){
        return 124567890;
    }
    String getAddress(){
        return "13/33 kolathur";
    }

    public static void main(String[] args) {
        // Excercise add = new Excercise();
        // int returnVal = add.sum(10,20);
        // System.out.print(returnVal);

        Excercise NameandNumber = new Excercise();
        String Name = NameandNumber.getName();
        int number = NameandNumber.getPhone();
        String address = NameandNumber.getAddress();
        System.out.println(Name);
        System.out.println(number);
        System.out.println(address);

    }
}
