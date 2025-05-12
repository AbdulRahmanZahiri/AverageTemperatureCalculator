import java.util.Scanner;

public class TempCalculator {

    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("              🌡️ Welcome to the Temperature Analyzer 🌡️");
        System.out.println("============================================================");
        System.out.println();
        System.out.println("🔸 Please enter five temperatures in Celsius.");
        System.out.println("🔸 The program will calculate the average temperature.");
        System.out.println("🔸 It will also count how many temperatures are above average."); 
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("➡️  Enter the first temperature (°C): ");
        double t1 = scanner.nextDouble();

        System.out.print("➡️  Enter the second temperature (°C): ");
        double t2 = scanner.nextDouble();

        System.out.print("➡️  Enter the third temperature (°C): ");
        double t3 = scanner.nextDouble();

        System.out.print("➡️  Enter the fourth temperature (°C): ");
        double t4 = scanner.nextDouble();

        System.out.print("➡️  Enter the fifth temperature (°C): ");
        double t5 = scanner.nextDouble();

        double average = (t1 + t2 + t3 + t4 + t5) / 5;

        double[] temps = {t1, t2, t3, t4, t5};
        int countAboveAverage = 0;

        for (double temp : temps) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.printf(" The average temperature is: %.2f°C%n", average);
        System.out.println("📈 Temperatures above average: " + countAboveAverage);
        System.out.println("============================================================");

        scanner.close();
    }
}
