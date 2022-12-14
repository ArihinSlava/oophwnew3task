public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isBlank()) {
            this.brand = "Default";
        }else
            this.brand = brand;

        if (model == null || model.isBlank()) {
            this.model = "Default";
        }else
            this.model = model;


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else
            this.engineVolume = Math.abs(engineVolume);


        if (color == null || color.isBlank()) {
            this.color = "Белый";
        }else
            this.color = color;


        if (year <= 0) {
            this.year = 2000;
        } else
            this.year = Math.abs(year);


        if (country == null || country.isBlank()) {
            this.country = "Default";
        }else
            this.country = country;
    }

    void information() {
        System.out.println(brand + " " + model + ". " + year + " год выпуска , сборка " + country +  ". " + color + " цвет кузова , объем двигателя - " + engineVolume + "л.");
    }
}
