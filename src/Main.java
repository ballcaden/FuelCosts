import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        boolean validOutput1 = false;
        boolean validOutput2 = false;
        boolean validOutput3 = false;

        do {
            System.out.println("Please enter the current amount of gallons in your car: ");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                if (gallons >= 0) {
                    validOutput1 = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again");
                scan.nextLine();
            }
        } while (!validOutput1);

        do {
            System.out.println("Please enter the fuel efficiency of your car in MPG: ");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                if (mpg > 0) {
                    validOutput2 = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again");
                scan.nextLine();
            }
        } while (!validOutput2);

        do {
            System.out.println("Please enter the price of your gas per gallon: ");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                if (pricePerGallon > 0) {
                    validOutput3 = true;
                } else {
                    System.out.println("You've entered an invalid value. Please try again");
                    scan.nextLine();
                }
            } else {
                System.out.println("You've entered an invalid value. Please try again");
                scan.nextLine();
            }
        } while (!validOutput3);

        System.out.println("Cost per 100 miles in $: " + pricePerGallon * 100);
        System.out.println("Distance Left in Miles: " + mpg * gallons);
    }
}