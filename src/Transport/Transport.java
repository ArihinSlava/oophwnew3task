package Transport;

public class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int year, String country,
                     String color,
                     int maxSpeed) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = "Default";
        } else {
            this.country = country;
        }

        if (color == null || color.isBlank()) {
            this.color = "Default";
        } else {
            this.color = color;
        }

        if (maxSpeed <= 0) {
            this.maxSpeed = 130;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color
                     ) {

            this.brand = brand;
            this.model = model;
            this.year = year;
            this.country = country;
            this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
