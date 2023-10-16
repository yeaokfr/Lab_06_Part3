import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length;
        double width;
        double area;
        double perimeter;
        double hypotenuse;

        System.out.println("What is the length of the triangle?");
        do {
            if (scan.hasNextDouble()) {

                length = scan.nextDouble();
                if (length > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        System.out.println("What is the width of the triangle?");
        do {
            if (scan.hasNextDouble()) {

                width = scan.nextDouble();
                if (width > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        area = length*width;
        perimeter = (length*2) + (width*2);
        double cSquared = Math.pow(length, 2) + Math.pow(width, 2);
        hypotenuse = Math.sqrt(cSquared);

        System.out.printf("%-7s %.2f","Length:", length);
        System.out.printf("\n%-6s %.2f", "Width:", width);
        System.out.printf("\n%-5s %.2f", "Area:", area);
        System.out.printf("\n%-8s %.2f", "Perimeter", perimeter);
        System.out.printf("\n%-9s %.2f", "Hypotenuse:", hypotenuse);
    }
}