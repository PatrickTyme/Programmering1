package Opgave10_1;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStation ws1 = new WeatherStation();
        WeatherStation ws2 = new WeatherStation(45, 3);
        WeatherStation ws3 = WeatherStation.fromImperial(82, 15);

        System.out.printf("WS1 temperature in celcius: %.1f\n", ws1.getTemperature());
        System.out.printf("WS1 temperature in fahrenheit: %.1f\n", ws1.getTemperatureFahrenheit());
        System.out.printf("WS1 pressure in bars: %.1f\n", ws1.getPressure());
        System.out.printf("WS1 pressure in PSI: %.1f\n", ws1.getPsi());
        System.out.println();
        System.out.println();

        System.out.printf("WS2 temperature in celcius: %.1f\n", ws2.getTemperature());
        System.out.printf("WS2 temperature in fahrenheit: %.1f\n", ws2.getTemperatureFahrenheit());
        System.out.printf("WS2 pressure in bars: %.1f\n", ws2.getPressure());
        System.out.printf("WS2 pressure in PSI: %.1f\n", ws2.getPsi());
        System.out.println();
        System.out.println();

        System.out.printf("WS3 temperature in celcius: %.1f\n", ws3.getTemperature());
        System.out.printf("WS3 temperature in fahrenheit: %.1f\n", ws3.getTemperatureFahrenheit());
        System.out.printf("WS3 pressure in bars: %.1f\n", ws3.getPressure());
        System.out.printf("WS3 pressure in PSI: %.1f\n", ws3.getPsi());
    }
}

