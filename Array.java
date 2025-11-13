
import java.util.Scanner;


class Array{
    public static void main( String args[])
    {
        // // String[] playlist = new String[3];
        // String[] playlist = {"song 1", "song 2", "song 3"};

        // // playlist[0] = "Song 1";
        // System.out.println(playlist[0]);
        // // playlist[1] = "Song 2";
        // System.out.println(playlist[1]);
        // // playlist[2] = "Song 3";
        // System.out.println(playlist[2]);

        // Example Question for Array
        // Create an iteger array, Get input for 5 numbers and print their sum or total

        int[] num5 = new int[5];
        Scanner scan = new Scanner(System.in);
        num5[0] = scan.nextInt();
        num5[1] = scan.nextInt();
        num5[2] = scan.nextInt();
        num5[3] = scan.nextInt();
        num5[4] = scan.nextInt();
        int result = 0;
        for(int i = 0; i<num5[4]; i=i+1){
            result = result + num5[i];
        }
            System.out.println(result);

    }
}