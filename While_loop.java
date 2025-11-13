
import java.util.Random;

class While_loop {

    public static void main(String args[]) {

        Random ran = new Random();

        int j = 0;
        while (j != 5) {
            j = ran.nextInt(10);
            System.out.println(j);
            // j=j+1;
        }
    }
}
