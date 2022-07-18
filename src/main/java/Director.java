public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void constructSportCar(Builder builder){
        builder.reset();
        builder.setSets(2);
        builder.setEngine(new SportEngine("sport"));
        builder.setTripComputer(true);
        builder.setGPS(false);
    }
    public void constructorSUV(Builder builder){
        builder.reset();
        builder.setSets(9);
        builder.setEngine(new SUVEngine("suv"));
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
