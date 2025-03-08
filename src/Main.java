import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking the base step of triangle by user
        System.out.println("Enter the number of steps of the triangle you want to print: ");
        int steps = scanner.nextInt();

        //Creating triangle
        for (int i = steps; i > 0; i--) { //Starting from the number of digits, it decreases down to zero
            for (int j = 0; j < i; j++) { //Printing i stars per line
                System.out.print("* ");
            }
            //Going to the next line at the end of the line
            System.out.println();
        }


    }
}