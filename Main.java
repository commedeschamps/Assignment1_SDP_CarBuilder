

public class Main {
    public static void main(String[] args) {
        CarBuilderInterface builder = new Car.CarBuilder();
        CarDirector director = new CarDirector(builder);

        Car WhiteFerrari = new Car.CarBuilder()
                .setBrand("Ferrari")
                .setModel("488 Spider")
                .setYear(2021)
                .setColor("White")
                .setEngineType("V8")
                .setPrice(280000.0)
                .setIsElectric(false)
                .setMileage(5000)
                .setNumberOfDoors(2)
                .setTransmissionType("Automatic")
                .build();
        System.out.println(WhiteFerrari);


        Car basicCar = director.constructBasicCar("Default","Basic");
        System.out.println(basicCar);

        Car luxuryCar = director.constructLuxuryCar("Luxury", "Premium");
        System.out.println(luxuryCar);

        Car toyota = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Silver")
                .setEngineType("V6")
                .setPrice(30000.0)
                .setIsElectric(false)
                .setMileage(15000)
                .setNumberOfDoors(4)
                .setTransmissionType("Automatic")
                .build();
        System.out.println(toyota);

        Car BasicCar = director.constructBasicCar("Kia", "Rio");
        System.out.println(BasicCar);

        Car LuxuryCar = director.constructLuxuryCar("BMW", "X5");
        System.out.println(LuxuryCar);

        Car Mercedes = director.constructLuxuryCar("Mercedes", "GLE");
        System.out.println(Mercedes);
        Car WhiteMerin = new Car.CarBuilder()
                .setBrand(Mercedes.getBrand())
                .setModel(Mercedes.getModel())
                .setYear(2023)
                .setColor("White")
                .setEngineType(Mercedes.getEngineType())
                .setPrice(85000.0)
                .setIsElectric(Mercedes.isElectric())
                .setMileage(5000)
                .setNumberOfDoors(Mercedes.getNumberOfDoors())
                .setTransmissionType(Mercedes.getTransmissionType())
                .build();
        System.out.println(WhiteMerin);
    }

}