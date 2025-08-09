import java.util.Scanner;

public class Lesson008_R1_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter one-way commute distance (miles): ");
        double oneWayCommuteDistance = scanner.nextDouble();

        System.out.print("Enter starting odometer reading: ");
        double startOdometer = scanner.nextDouble();

        System.out.print("Enter ending odometer reading: ");
        double endOdometer = scanner.nextDouble();

        System.out.print("Enter number of work days: ");
        int workDays = scanner.nextInt();

        // Step 2: Total miles driven
        double totalMiles = endOdometer - startOdometer;

        // Step 3: Commute miles (round trip per day)
        double commuteMiles = workDays * 2 * oneWayCommuteDistance;

        // Step 4: Personal miles
        double personalMiles = totalMiles - commuteMiles;

        // Step 5: Calculate fractions
        double commuteFraction = commuteMiles / totalMiles;
        double personalFraction = personalMiles / totalMiles;

        // Step 6: Output
        System.out.printf("Total miles driven: %.2f\n", totalMiles);
        System.out.printf("Commute miles: %.2f (%.2f%%)\n", commuteMiles, commuteFraction * 100);
        System.out.printf("Personal miles: %.2f (%.2f%%)\n", personalMiles, personalFraction * 100);

        scanner.close();
    }
}
