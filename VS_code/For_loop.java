
class For_loop {

    public static void main(String args[]) {
        // for(int i=10; i>=1; i=i-1)
        // {
        //     System.out.println(i);
        // }

        // Example Question 1 - nested For loop
        // print this output
        // ***
        // ***
        // ***
        // for(int i=1; i<=3; i=i+1){
        //     for(int j=1; j<=3; j=j+1){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Example Question 1 - nested For loop
        // print this output
        // *
        // **
        // ***
        // for(int i=1; i<=3; i=i+1){
        //     for(int j=1; j<=i; j=j+1){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        for (int j = 1; j <= 10; j = j + 1) {
            for (int i = 1; i <= j; i = i + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
