public class Garden {
    // Q2 Create a class called garden 
    // this class should have 2 variables 
    // apple_price = 20;
    // apple_count = 5;
    // Create a function called total_money which should multiply count with price and display the total amount

    int apple_price = 20;
    int apple_count = 5;

    void total_money(){
        int result = apple_price * apple_count;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Garden thottam = new Garden();

        thottam.total_money();
    }
}