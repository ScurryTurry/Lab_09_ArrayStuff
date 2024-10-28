import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];

        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = gen.nextInt(100) + 1;
            System.out.printf("%3d", dataPoints[x]);
            System.out.print(" | ");
            if ((x + 1) % 20 == 0)
                System.out.println();
        }
        int sum = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            sum += dataPoints[x];
        }
        int ave = sum / dataPoints.length;
        System.out.println("\nThe average for this data set is: " + ave);

        int searchValue = 0;
        searchValue = SafeInput.getRangedInt(in, "Enter a number between ", 1, 100);
        boolean found = false;

        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == searchValue) {
                found = true;
                System.out.println("Found " + searchValue + " at index " + x);
            }
        }
        if (!found) {
            System.out.println("No matches found for " + searchValue);
        }

        int breakingValue = 0;
        breakingValue = SafeInput.getRangedInt(in, "Enter a number between ", 1, 100);

        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == breakingValue) {
                found = true;
                System.out.println("Breaking Point first found " + breakingValue + " at index " + x);
                break;
            }
        }
        if (!found) {
            System.out.println("No matches found for " + breakingValue);
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] < min) {
                min = dataPoints[x];
            }
            if (dataPoints[x] > max) {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum value for this data set is: " + min + "\nThe maximum value for this data set is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }

    public static double getAverage(int values[]) {
        double sum = 0.0;
        for (int x = 0; x < values.length; x++) {
            sum += values[x];
        }
        return sum / values.length;
    }

}