import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define the variables
        int x, y;
        double hypo;

        //create Scanner object
        Scanner input = new Scanner(System.in);

        //get the two right sides of the triangle from the user
        System.out.println("Enter 1st side: ");
        x = input.nextInt();
        System.out.println("Enter 2nd side: ");
        y = input.nextInt();

        //do the math
        hypo = Math.sqrt((x*x) + (y*y));

        //print the result
        System.out.println("Hypotenuse: " + hypo);
    }
}