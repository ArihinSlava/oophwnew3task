public class Main {
    public static void main(String[] args) {

        Car car = new Car("Lada","Granta",1.7,"Желтый",2015,"Россия");
        car.information();

        Car car1 = new Car("Audi","A8",3.0,"Черный",2020,"Германия");
        car1.information();

        Car car2 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия");
        car2.information();

        Car car3 = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея");
        car3.information();

        Car car4 = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея");
        car4.information();

    }
}