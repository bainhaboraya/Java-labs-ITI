import java.util.function.Function;

public class TempConverter {

    public static void main(String[] args) {
        if (args.length == 1) {
            double celsius = Double.parseDouble(args[0]);
            double fahrenheit = convertTemperature(celsius, new Function<Double, Double>() {
                @Override
                public Double apply(Double celsius) {
                    return celsiusToFahrenheit(celsius);
                }
            });
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("You must enter a temperature to convert.");
        }
    }

    public static double convertTemperature(double celsius, Function<Double, Double> celsiusToFahrenheit) {
        return celsiusToFahrenheit.apply(celsius);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}