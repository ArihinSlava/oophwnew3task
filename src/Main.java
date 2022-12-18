import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Lada","Granta",
                1.7,"Желтый",-5 ,
                "Россия","Механическая" , "Седан",
                "А189ТМ621",5,false);
        car.information();

        Car car1 = new Car("Audi","A8",
                3.0,"Черный",2020,
                "Германия","Автоматическая","Седан",
                "А555В554",5, true);
        car1.information();

        Car car2 = new Car("BMW","Z8",
                3.0,"Черный",2021,
                "Германия","Автоматическая", "Родстер",
                "В646А123",2, false);
        car2.information();

        Car car3 = new Car("Kia",
                "Sportage 4-го поколения",
                2.4,
                "Красный",
                2018,
                "Южная Корея",
                "Автоматическая",
                "Кроссовер",
                "Х554В133",
                5,
                true);
        car3.information();

        Car car4 = new Car("Hyundai","Avante",
                1.6,"Оранжевый",2016,
                "Южная Корея","Автоматическая","Седан",
                "В155М544", 5, true);
        car4.information();



    }
}