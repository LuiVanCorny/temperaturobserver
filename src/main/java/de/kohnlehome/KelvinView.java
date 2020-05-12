package de.kohnlehome;

public class KelvinView implements Observer {
    private TemperatureModel temperatureModel;

    public KelvinView(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;

        this.temperatureModel.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Kelvin: " + temperatureModel.getTemperatureInKelvin());
    }
}
