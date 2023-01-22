import driver.Driver;
import driver.DriverB;
import driver.DriverD;
import driver.DriverС;
import exception.DiagnosticFaildException;


public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Водитель категории B", true, 1);
        DriverС driverC = new DriverС("Водитель категории C", true, 3);
        DriverD driverD = new DriverD("Водитель категории D", true, 2);


        Car Car = new Car("BMW", "3", 1.6, driverB);
        Car Car1 = new Car("BMW", "4", 1.6, null);
        Bus Bus = new Bus("Iveco", "1345", 2.5, driverD);
        Truck Truck = new Truck("Volvo", "Go", 3.0, driverC);


        try {
            System.out.println(Car.diagnostics());
        } catch (DiagnosticFaildException e) {
            e.printStackTrace();
        }


        try {
            System.out.println(Car1.diagnostics());
        } catch (DiagnosticFaildException e) {
            e.printStackTrace();
        }


    }

    private static void printInfo(Transport<?> transport) {
        System.out.println(" " + transport.getDriver() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() + " обьемом " + transport.getEngineVolume() + " и будет учавствовать в заезде");


    }
}
