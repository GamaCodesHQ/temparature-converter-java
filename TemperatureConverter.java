import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bolean keepRunning = true;

        System.out.println("Welcome to the Temperature Converter!");
        while (keepRunning) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");

            Syste.out.println("Your choice: ");
            int choice = scanner.nextInt();

            Switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
                    break;
                case 3:
                    keepRunning = false;
                    System.out.println("Exiting the Temperature Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }
    scanner.close();
}

 public static double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
