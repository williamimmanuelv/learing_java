public class Addition{
    // Q1 create a class called Addition. This class shoud have 2 varibles
    // a = 10;
    // b = 20;
    // Create a fuction called sum which should add a & b and print the total output 
    // call the sum function form main method

    int a = 10;
    int b = 20;

    void sum(){
        int result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Addition add = new Addition();

        add.sum();
    }
}