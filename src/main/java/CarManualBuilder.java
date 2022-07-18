public class CarManualBuilder implements Builder {
    private Manual manual;
    CarManualBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.manual = new Manual();
    }
    @Override
    public void setSets(int number) {
        manual.numberSeats = number;
    }
    @Override
    public void setEngine(Engine engine) {
        manual.engine = engine.name;
    }
    @Override
    public void setTripComputer(boolean tripComputer) {
        manual.tripComputer = tripComputer;
    }
    @Override
    public void setGPS(boolean gps) {
        manual.gps = gps;
    }

    public Manual getResult(){

        Manual product = this.manual;
        this.reset();
        return  product;
    }
}
