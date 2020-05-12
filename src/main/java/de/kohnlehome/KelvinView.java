package de.kohnlehome;

public class KelvinView implements Observer {
    private TemperatureModel temperatureModel;

    public KelvinView(TemperatureModel temperatureModel) {
        this.temperatureModel = temperatureModel;

        this.temperatureModel.attach(this);
    }

    @Override
    public void update() {
        double temperature = temperatureModel.getTemperatureInKelvin();
        String text = String.format("Kelvin: %.1fK", temperature);
        System.out.println(text);
    }
}
