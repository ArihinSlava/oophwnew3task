public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    void information() {
        System.out.println(brand + " " + model + ". " + year + " год выпуска , сборка " + country +  ". " + color + " цвет кузова , объем двигателя - " + engineVolume + "л.");
    }
}
