package de.kohnlehome;

import java.util.Random;

public class TemperatureModel extends Subject {
    private double temperatureInKelvin;
    private Random random;

    public TemperatureModel() {
        random = new Random();
        changeTemperature();
    }

    public void changeTemperature() {
        temperatureInKelvin = random.nextDouble()*1000;
        notifyObservers();
    }

    public double getTemperatureInKelvin() {
        return temperatureInKelvin;
    }
}
