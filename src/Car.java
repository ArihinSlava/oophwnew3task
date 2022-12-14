public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void information() {
        System.out.println(brand + " " + model + ". " + year + " год выпуска , сборка " + country +  ". " + color + " цвет кузова , объем двигателя - " + engineVolume + "л.");
    }
}
