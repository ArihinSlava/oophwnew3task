public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Lada";
        car.model = "Granta";
        car.engineVolume = 1.7;
        car.color = "Желтый";
        car.year = 2015;
        car.country = "Россия";
        car.information();

        Car car1 = new Car();
        car1.brand = "Audi";
        car1.model = "А8";
        car1.engineVolume = 3.0;
        car1.color = "Черный";
        car1.year = 2020;
        car1.country = "Германия";
        car1.information();

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "Z8";
        car2.engineVolume = 3.0;
        car2.color = "Черный";
        car2.year = 2021;
        car2.country = "Германия";
        car2.information();

        Car car3 = new Car();
        car3.brand = "Kia";
        car3.model = "Sportage 4-го поколения";
        car3.engineVolume = 2.4;
        car3.color = "Красный";
        car3.year = 2018;
        car3.country = "Южная Корея";
        car3.information();

        Car car4 = new Car();
        car4.brand = "Hyundai";
        car4.model = "Avante";
        car4.engineVolume = 1.6;
        car4.color = "Оранжевый";
        car4.year = 2016;
        car4.country = "Южная Корея";
        car4.information();

    }
}