package de.kohnlehome;

public class CelsiusView implements Observer {
    private TemperatureModel temperatureModel;

    public CelsiusView(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
        this.temperatureModel.attach(this);
    }

    @Override
    public void update() {
        double temperatureInKelvin = temperatureModel.getTemperatureInKelvin();
        double temperatureInCelsius = temperatureInKelvin - 273.15;
        String text = String.format("Celsius: %.1fC°", temperatureInCelsius);
        System.out.println(text);
    }
}
