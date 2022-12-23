import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "Желтый",
                2005 ,
                "Россия"
        );
        lada.setRegistrationNumber("в987ау195");



        Car audi = new Car(
                "Audi",
                "A8",
                3.0,
                "Черный",
                2020,
                "Германия"
        );
        audi.setTransmission("автомат");

        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Черный",
                2021,
                "Германия"
        );
        bmw.setTypeOfRubber(false);


        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "Красный",
                2018,
                "Южная Корея"
        );


        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея");


        Bus ikarus = new Bus(
                "Икарус",
                "Z50",
                2007,
                "Венгрия",
                "Красный",
                90
        );

        Bus liaz = new Bus(
                "Лиаз",
                "Гармошка",
                2000,
                "Россия",
                "Синий",
                60
        );

        Bus man = new Bus(
                "Man",
                "А24",
                2010,
                "Германия",
                "Белый",
                110
        );


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
        printBusInfo(ikarus);
        printBusInfo(liaz);
        printBusInfo(man);


    }

    private static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() +
                ", год выпуска: " +  car.getYear() +
                ", страна сборки: " + car.getCountry() +
                ", цвет кузова: " + car.getColor() +
                ", объем двигателя: " + car.getEngineVolume() +
                ", коробка передач: " + car.getTransmission() +
                ", типа кузова: " + car.getBodyType() +
                ", рег.номер " + car.getRegistrationNumber() +
                ", кол-во мест: " + car.getNumberOfSeat() +
                ", " + (car.getKey().isWithoutKeyAccess() ? " безключевой доступ" : "безключевой доступ") +
                ", "+(car.getKey().isRemoteRunEngine() ? "удаленный доступ " : "Обычный запуск") +
                ", номер страховки: " + car.getInsurance().getNumber() +
                ", стоимость страховки: " + car.getInsurance().getCost() +
                ", срок действия страховки " + car.getInsurance().getExpireDate()
        );
    }

    private static void printBusInfo(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() +
                ", год выпуска: " + bus.getYear() +
                ", цвет кузова: " + bus.getColor() +
                ", страна сборки: " + bus.getCountry() +
                ", цвет кузова: " + bus.getColor() +
                ", максимальная скорость: " + bus.getMaxSpeed()
        );
    }
}