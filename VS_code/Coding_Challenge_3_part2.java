import java.util.Scanner;

class part_3_2 {

    public static void main(String args[]) {
        {
        // Q1
        // Get input for 5 Numbers using Array and for loop

            // int[] marks = new int[5];

            // Scanner scan = new Scanner(System.in);
            // for (int i = 0; i <= 4; i = i + 1) {
            //     marks[i] = scan.nextInt();
            // }

            // for(int i=0; i<=4; i=i+1){
            //     System.out.println("marks no " + i + " : " + marks[i]);
            // }

        // Print 10 numbers from an Array using for loop

            // int[] ten = { 1,2,3,4,5,6,7,8,9,10};

            // for(int i=0; i<10; i=i+1){
            //     System.out.print(ten[i]);
            // }

        // Q3
        // print 2 table
            // Scanner scan = new Scanner(System.in);
            // int mult = scan.nextInt();
            // for(int i=1; i<=10; i=i+1){
            //     System.out.println(mult +" X " + i + " = " + i*mult);
            // }

        // Q4
        // get input for size on array, Get input for each element in an array,
        // Find and print middle element in an array

            Scanner scan = new Scanner(System.in);
            int inputSize = scan.nextInt();

            int[] size = new int[inputSize];

            for(int i=0; i<inputSize; i=i+1){
                size[i] = scan.nextInt();
            }

            int length = inputSize / 2;
            System.out.println("Middle Ground : "+length);
            if(inputSize % 2 == 0){
                System.out.println("There is no middle ground");
            }
            else{
                System.out.println("Middle Number :  " + size[length]);
            }


        }
    }
}
