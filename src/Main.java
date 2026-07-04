// Base Vehicle class
abstract class Vehicle {
    protected double distance;
    protected double mileage;

    public Vehicle(double distance, double mileage) {
        this.distance = distance;
        this.mileage = mileage;
    }

    // Abstract method for fuel consumption calculation
    public abstract double fuelConsumption();
}

// Truck class inheriting Vehicle
class Truck extends Vehicle {
    public Truck(double distance, double mileage) {
        super(distance, mileage);
    }

    @Override
    public double fuelConsumption() {
        return distance / mileage;
    }
}

// ElectricCar class inheriting Vehicle
class ElectricCar extends Vehicle {
    private double batteryEfficiency;

    public ElectricCar(double distance, double mileage, double batteryEfficiency) {
        super(distance, mileage);
        this.batteryEfficiency = batteryEfficiency;
    }

    @Override
    public double fuelConsumption() {
        return distance / (mileage * batteryEfficiency);
    }
}

// GasolineCar class inheriting Vehicle
class GasolineCar extends Vehicle {
    private double gasolineEfficiency;

    public GasolineCar(double distance, double mileage, double gasolineEfficiency) {
        super(distance, mileage);
        this.gasolineEfficiency = gasolineEfficiency;
    }

    @Override
    public double fuelConsumption() {
        return distance / (mileage * gasolineEfficiency);
    }
}

// Main class to test polymorphism
public class 40_4_C {
    public static void main(String[] args) {
        Vehicle truck = new Truck(500, 10); // Example values
        Vehicle electricCar = new ElectricCar(500, 10, 0.8);
        Vehicle gasolineCar = new GasolineCar(500, 10, 0.9);

        System.out.println("Truck Fuel Consumption: " + truck.fuelConsumption());
        System.out.println("Electric Car Fuel Consumption: " + electricCar.fuelConsumption());
        System.out.println("Gasoline Car Fuel Consumption: " + gasolineCar.fuelConsumption());
    }
}
