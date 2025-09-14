public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String color;
    private String engineType;
    private boolean isElectric;
    private int numberOfDoors;
    private String transmissionType;
    private double price;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public double getPrice() {
        return price;
    }
    //private constructor
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.mileage = builder.mileage;
        this.color = builder.color;
        this.engineType = builder.engineType;
        this.isElectric = builder.isElectric;
        this.numberOfDoors = builder.numberOfDoors;
        this.transmissionType = builder.transmissionType;
        this.price = builder.price;
    }



    //nested builder class
public static class CarBuilder implements CarBuilderInterface {
    private String brand = "Unknown";
    private String model = "Default";
    private int year = 2000;
    private int mileage = 0;
    private String color = "Black";
    private String engineType = "V4";
    private boolean isElectric = false;
    private int numberOfDoors = 4;
    private String transmissionType = "Manual";
    private double price = 10000.0;



    @Override
    public CarBuilderInterface setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilderInterface setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
        return this;
    }

    @Override
    public CarBuilderInterface setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive");
        }
        this.year = year;
        return this;
    }

    @Override
    public CarBuilderInterface setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative");
        }
        this.mileage = mileage;
        return this;
    }

    @Override
    public CarBuilderInterface setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.color = color;
        return this;
    }

    @Override
    public CarBuilderInterface setEngineType(String engineType) {
        if (engineType == null || engineType.isEmpty()) {
            throw new IllegalArgumentException("Engine type cannot be null or empty");
        }
        this.engineType = engineType;
        return this;
    }
    @Override
    public CarBuilderInterface setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
        return this;
    }


    @Override
    public CarBuilderInterface setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    @Override
    public CarBuilderInterface setTransmissionType(String transmissionType) {
        if (transmissionType == null || transmissionType.isEmpty()) {
            throw new IllegalArgumentException("Transmission type cannot be null or empty");
        }
        this.transmissionType = transmissionType;
        return this;
    }

    @Override
    public CarBuilderInterface setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
        return this;
    }

    @Override
    public Car build() {
        if (isElectric && !engineType.equalsIgnoreCase("Electric")) {
            throw new IllegalArgumentException("Invalid configuration: electric car cannot have " + engineType + " engine");
        }
        return new Car(this);
    }

}
    @Override
    public String toString() {
        return String.format("%s %s (%d) | %s | Engine:%s | $%.2f | Electric:%s | %d km | Doors:%d | %s",
                brand, model, year, color, engineType, price, isElectric ? "Yes" : "No",
                mileage, numberOfDoors, transmissionType);
    }
}
