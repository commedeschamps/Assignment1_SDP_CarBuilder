public class CarDirector {
    private final CarBuilderInterface builder;

    public CarDirector(CarBuilderInterface builder) {
        this.builder = builder;
    }

    public Car constructBasicCar(String brand, String model) {
        return builder
                .setBrand(brand)
                .setModel(model)
                .setYear(2020)
                .setColor("White")
                .setEngineType("V4")
                .setPrice(20000.0)
                .build();
    }

    public Car constructLuxuryCar(String brand, String model) {
        return builder
                .setBrand(brand)
                .setModel(model)
                .setYear(2023)
                .setColor("Black")
                .setEngineType("V8")
                .setIsElectric(false)
                .setPrice(80000.0)
                .build();

    }
}