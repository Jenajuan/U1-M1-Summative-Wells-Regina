import java.util.Scanner;

public class validNumber {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int vNum;

        do {
            System.out.println("Please enter a number between 1 and 10");
            vNum = number.nextInt();
        } while (vNum < 1 || vNum > 10);
    }
}