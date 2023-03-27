package Opgave10_1;

import javax.naming.ldap.PagedResultsControl;

public class WeatherStation {
    private double temperature; // celcius
    private double pressure; // Bar
    private static double psiInBar = 14.5038;


    public WeatherStation() {
        temperature = 0;
        pressure = 1;
    }

    public WeatherStation(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }
        public static WeatherStation fromImperial(double fahrenheit, double psi) {
            return new WeatherStation(toCelcius(fahrenheit), toBar(psi/psiInBar));
        }

     public static double toCelcius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
     }

     public static double toBar(double psi) {
         return (psi / psiInBar);
     }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setTemperatureFahrenheit(double fahrenheit) {
        this.temperature = toCelcius(temperature);
    }

    public double getTemperatureFahrenheit() {
        return 1.8 * temperature + 32;
    }

    public double getPsi() {
        return pressure * psiInBar;
    }

    public void setPressurePSI(double psi) {
            this.pressure = toBar(psi);
        }


    }

