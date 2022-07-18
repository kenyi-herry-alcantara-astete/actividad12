public class Aplication {

    public static void main(String[] args) {
        Director director = new Director();

        //Building a suv car  without a director
        CarBuilder builder0 = new CarBuilder();
        builder0.reset();
        builder0.setEngine(new SUVEngine("suv"));
        builder0.setSets(9);
        builder0.setGPS(true);
        builder0.setTripComputer(false);


        //Building a manual usv car using a director
        CarManualBuilder builder0Manual = new CarManualBuilder();
        director.constructorSUV(builder0Manual);
        Manual manual0 = builder0Manual.getResult();
        imprimeManual(manual0);

        //Building a sport car using a director
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();

        //Building a manual sport car using a director
        CarManualBuilder builderManual = new CarManualBuilder();
        director.constructSportCar(builderManual);
        Manual manual = builderManual.getResult();

        imprimeManual(manual);
    }

    static void imprimeManual(Manual manual){
        System.out.println("\nManual car:");
        System.out.println("Name:"+manual.engine);
        System.out.println("NumberSeats:"+manual.numberSeats);
        System.out.println("Gps:"+manual.gps);
        System.out.println("TripComputer:"+manual.tripComputer);
    }
}
