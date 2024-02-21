import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the input temperature unit:");
        System.out.println("1. Kelvin");
        System.out.println("2. Celsius");
        System.out.println("3. Fahrenheit");

        int choice = scanner.nextInt(); 

        double inputTemperature;
        String inputUnit;

        switch (choice) {
            case 1:
                inputUnit = "Kelvin";
                break;
            case 2:
                inputUnit = "Celsius";
                break;
            case 3:
                inputUnit = "Fahrenheit";
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                return;
        }
// why do i feel like there is a big bug here but i cant find it i need physical help 
        System.out.print("Enter temperature in " + inputUnit + ": ");
        inputTemperature = scanner.nextDouble();

        double kelvin = convertToKelvin(inputTemperature, inputUnit);
        double celsius = kelvinToCelsius(kelvin);
        System.out.println("Temperature in Celsius: " + celsius + " °C");

        double fahrenheit = kelvinToFahrenheit(kelvin);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");

        scanner.close();
    }

    private static double convertToKelvin(double temperature, String unit) {
        switch (unit.toLowerCase()) {
            case "kelvin":
                return temperature;
            case "celsius":
                return temperature + 273.15;
            case "fahrenheit":
                return (temperature - 32) * 5/9 + 273.15;
            
        }
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
