package de.kohnlehome;

public class CelsiusView implements Observer {
    private TemperatureModel temperatureModel;

    public CelsiusView(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;
        this.temperatureModel.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Celsius: temperature has changed!");
    }
}
