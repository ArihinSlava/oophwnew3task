package Transport;

public class Car {

    private static class Key {

        private final boolean remoteStart;
        private final boolean notKeyAccess;

        public Key(boolean remoteStart, boolean notKeyAccess) {
            this.remoteStart = remoteStart;
            this.notKeyAccess = notKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isNotKeyAccess() {
            return notKeyAccess;
        }
    }

     String brand;
     String model;
    double engineVolume;
    String color;
     int year;
     String country;
    String transmission;
    String bodyType;
    String registrationNumber;
    int numberOfSeat;
    boolean typeOfRubber;
     String seasonsType;






    public Car(String brand, String model, double engineVolume, String color,
                    int year, String country, String transmission, String bodyType,
                    String registrationNumber, int numberOfSeat, boolean typeOfRubber) {

        this.typeOfRubber = typeOfRubber;

        if (typeOfRubber) {
            this.seasonsType = "Летняя";
        } else
            this.seasonsType = "Зимняя";

        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "Default";
        } else
            this.transmission = transmission;


        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "Default";
        } else
            this.bodyType = bodyType;


        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "Default";
        } else
            this.registrationNumber = registrationNumber;

        if (numberOfSeat < 0) {
            this.numberOfSeat = numberOfSeat;
        } else
            this.numberOfSeat = Math.abs(numberOfSeat);


        if (brand == null || brand.isBlank()) {
            this.brand = "Default";
        } else
            this.brand = brand;

        if (model == null || model.isBlank()) {
            this.model = "Default";
        } else
            this.model = model;


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else
            this.engineVolume = Math.abs(engineVolume);


        if (color == null || color.isBlank()) {
            this.color = "Белый";
        } else
            this.color = color;


        if (year <= 0) {
            this.year = 2000;
        } else
            this.year = Math.abs(year);


        if (country == null || country.isBlank()) {
            this.country = "Default";
        } else
            this.country = country;
    }


    public void information() {
        System.out.println(getBrand() + " " + getModel() + ". " + getYear() +
                " год выпуска , сборка " + getCountry() + ". " + getColor() + " цвет кузова , объем двигателя - " +
                getEngineVolume() + "л. Коробка передач - " + getTransmission() + ". Тип кузова - " + getBodyType() + " Регистрационный номер - " +
                getRegistrationNumber() + " Количества мест - " + getNumberOfSeat() + ". Тип резины - " + seasonsType);
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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 0) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }


}


