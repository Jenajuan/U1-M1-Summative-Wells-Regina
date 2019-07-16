import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
   /*     int numArray = [];
        Scanner scanner = newInt(System.in);
        System.out.println(" Please enter a number.");
        System.out.println(numArray);
    }
}
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number :");

        int array[] = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }
    }
}