public class Main {
    public static void main(String[] args) {
        Bicycle bycicle = new Bicycle("Аист", 2);
        Car car = new Car("БМВ", 4);
        Truck truck = new Truck("Краз", 8);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bycicle, car, truck);


    }
}
