package hw_16_April;

public class Car {
    private String model;
    private String brand;
    private int year;
    private float engineVolume;

    public Car(String brand, String model, int year, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public float getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("%s - %s\nYear: %d\nEngine volume: %f", this.brand, this.model, this.year, this.engineVolume);
    }
}
