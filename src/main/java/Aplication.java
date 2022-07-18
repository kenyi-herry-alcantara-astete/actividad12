public class Aplication {

    public static void main(String[] args) {
        Director director = new Director();

        //Building a car
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();

        //Building a manual
        CarManualBuilder builderManual = new CarManualBuilder();
        director.constructSportCar(builderManual);
        Manual manual = builderManual.getResult();

        imprimeManual(manual);
    }

    static void imprimeManual(Manual manual){
        System.out.println("Manual car:");
        System.out.println("Name:"+manual.engine);
        System.out.println("NumberSeats:"+manual.numberSeats);
        System.out.println("Gps:"+manual.gps);
        System.out.println("TripComputer:"+manual.tripComputer);
    }
}
