/**
 * Created by Zdzibson on 2017-05-10.
 */
public class GettersAndSetters {
    private String brand;
    private double weight;
    private double mileage;
    private String driver;
    private String regNumber;
    private double latitude;
    private double longitude;


    public GettersAndSetters(String brand, double weight, double mileage, String driver, String regNumber, double latitude, double longitude) {
        this.brand = brand;
        this.weight = weight;
        this.mileage = mileage;
        this.driver = driver;
        this.regNumber = regNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters for vehicles' attributes

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public double getMileage() {
        return mileage;
    }

    public String getDriver() {
        return driver;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Setters for vehicles' attributes

    public void setLatitude() {
        this.latitude = latitude;
    }
    public void setLongitude(){
        this.longitude = longitude;
    }
}
