public interface CarBuilderInterface {
    CarBuilderInterface setBrand(String brand);
    CarBuilderInterface setModel(String model);
    CarBuilderInterface setYear(int year);
    CarBuilderInterface setMileage(int mileage);
    CarBuilderInterface setColor(String color);
    CarBuilderInterface setEngineType(String engineType);
    CarBuilderInterface setIsElectric(boolean isElectric);
    CarBuilderInterface setNumberOfDoors(int numberOfDoors);
    CarBuilderInterface setTransmissionType(String transmissionType);
    CarBuilderInterface setPrice(double price);
    Car build();
}