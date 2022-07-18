public class CarBuilder implements Builder{
    private Car car;
    public void reset(){
        this.car = new Car();
    }
    public void setSets(int number){
        car.numberSeats = number;
    }
    public void setEngine(Engine engine){
        car.engine = engine;
    }
    @Override
    public void setTripComputer(boolean tripComputer) {
        car.tripComputer = tripComputer;
    }
    @Override
    public void setGPS(boolean gps) {
        car.gps = gps;
    }
    public Car getResult(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
