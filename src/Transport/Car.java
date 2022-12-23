package Transport;

import java.time.LocalDate;

public class Car {


    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeat;
    private boolean typeOfRubber;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeat,
               boolean typeOfRubber,
               Key key,
               Insurance insurance) {
        if (brand == null || brand.isBlank()) {
            this.brand = "Default";
        } else
            this.brand = brand;

        if (model == null || model.isBlank()) {
            this.model = "Default";
        } else
            this.model = model;

        if (color == null || color.isBlank()) {
            this.color = "Белый";
        } else
            this.color = color;

        if (country == null || country.isBlank()) {
            this.country = "Default";
        } else
            this.country = country;

        if (transmission == null) {
            this.transmission = "ММКП";
        } else
            this.transmission = transmission;

        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else
            this.registrationNumber = registrationNumber;

        if (bodyType == null) {
            this.bodyType = "Седан";
        } else
            this.bodyType = bodyType;

        if (key == null) {
            this.key = new Key();
        }else
            this.key = key;

        if (insurance == null) {
            this.insurance = new Insurance();
        }else
            this.insurance = insurance;

        this.year = year;
        this.engineVolume = engineVolume;
        this.numberOfSeat =numberOfSeat;
        this.typeOfRubber = typeOfRubber;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country) {
        this(
                brand,
                model,
                engineVolume,
                color,
                year,
                country,
                "ММКП",
                "Седан",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance()
        );
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
        if (transmission == null) {
            this.transmission = "ММКП";
        }else
            this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        }else
            this.registrationNumber = registrationNumber;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public void changeTyres() {
        typeOfRubber = !typeOfRubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[7]);

    }

    public static class Key {

        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }

    }

    public static class Insurance {

        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        }
    }








