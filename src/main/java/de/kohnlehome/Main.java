package de.kohnlehome;

public class Main {
    public static void main(String[] args) {
        TemperatureModel temperatureModel = new TemperatureModel();
        CelsiusView celsiusView = new CelsiusView(temperatureModel);
        KelvinView kelvinView = new KelvinView(temperatureModel);

        temperatureModel.changeTemperature();
        temperatureModel.changeTemperature();
        temperatureModel.changeTemperature();
    }
}
