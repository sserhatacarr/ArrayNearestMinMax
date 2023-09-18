import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {5, 78, -5, 97, 123, 46, -41, 31, 26, -44};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int referenceNumber = input.nextInt();

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < referenceNumber && i > closestSmaller) {
                closestSmaller = i;
            }
            if (i > referenceNumber && i < closestLarger) {
                closestLarger = i;
            }
        }

        System.out.println("Closest smaller number to the given number: " + closestSmaller);
        System.out.println("Closest larger number to the given number: " + closestLarger);

    }
}
