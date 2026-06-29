package oops_practice.oops.gcr_codebase.polymorphism;

import java.util.Scanner;

class Vehicle2 {
    protected String vehicleNumber;
    protected String ownerName;
    protected String vehicleType;

    public Vehicle2(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public double calculateToll() {
        return 50.0;
    }

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner: " + ownerName);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}

class Car2 extends Vehicle2 {
    public Car2(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
        this.vehicleType = "Car";
    }

    @Override
    public double calculateToll() {
        return 50.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Toll: $" + String.format("%.2f", calculateToll()));
    }
}

class Bus2 extends Vehicle2 {
    public Bus2(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
        this.vehicleType = "Bus";
    }

    @Override
    public double calculateToll() {
        return 100.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bus");
        System.out.println("Toll: $" + String.format("%.2f", calculateToll()));
    }
}

class Truck extends Vehicle2 {
    private int axles;

    public Truck(String vehicleNumber, String ownerName, int axles) {
        super(vehicleNumber, ownerName);
        this.vehicleType = "Truck";
        this.axles = axles;
    }

    @Override
    public double calculateToll() {
        return 75.0 + (axles * 25.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
        System.out.println("Axles: " + axles);
        System.out.println("Toll: $" + String.format("%.2f", calculateToll()));
    }
}

public class SmartVehicleTollManagementSystem {
    public static double calculateTotalRevenue(Vehicle2[] vehicles) {
        double totalRevenue = 0;
        for (Vehicle2 vehicle : vehicles) {
            totalRevenue += vehicle.calculateToll();
        }
        return totalRevenue;
    }

    public static Vehicle2 searchVehicle(Vehicle2[] vehicles, String vehicleNumber) {
        for (Vehicle2 vehicle : vehicles) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                return vehicle;
            }
        }
        return null;
    }

    public static Vehicle2 findHighestToll(Vehicle2[] vehicles) {
        Vehicle2 highestTollVehicle = vehicles[0];
        double maxToll = vehicles[0].calculateToll();

        for (Vehicle2 vehicle : vehicles) {
            if (vehicle.calculateToll() > maxToll) {
                maxToll = vehicle.calculateToll();
                highestTollVehicle = vehicle;
            }
        }
        return highestTollVehicle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Smart Vehicle Toll Management System ===\n");

        Vehicle2[] vehicles = new Vehicle2[8];
        vehicles[0] = new Car2("DL-01-AB-1234", "Raj Kumar");
        vehicles[1] = new Car2("MH-02-CD-5678", "Priya Singh");
        vehicles[2] = new Bus2("KA-03-EF-9012", "City Transport");
        vehicles[3] = new Truck("UP-04-GH-3456", "Freight Co", 4);
        vehicles[4] = new Car2("TN-05-IJ-7890", "John Doe");
        vehicles[5] = new Bus2("AP-06-KL-1234", "State Transport");
        vehicles[6] = new Truck("MP-07-MN-5678", "Logistics Ltd", 6);
        vehicles[7] = new Truck("GJ-08-OP-9012", "Heavy Haul", 5);

        System.out.println("--- Vehicles Passing Through Toll Plaza ---\n");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Vehicle " + (i + 1) + ":");
            vehicles[i].displayInfo();
            System.out.println();
        }

        System.out.println("--- Toll Revenue Collection ---");
        double totalRevenue = calculateTotalRevenue(vehicles);
        System.out.println("Total Revenue: $" + String.format("%.2f", totalRevenue));

        System.out.println("\n--- Vehicle with Highest Toll ---");
        Vehicle2 highestTollVehicle = findHighestToll(vehicles);
        highestTollVehicle.displayInfo();
        System.out.println();

        System.out.println("--- Search Vehicle by Number ---");
        String searchNumber = "UP-04-GH-3456";
        Vehicle2 foundVehicle = searchVehicle(vehicles, searchNumber);
        if (foundVehicle != null) {
            System.out.println("Vehicle Found:");
            foundVehicle.displayInfo();
        } else {
            System.out.println("Vehicle with number " + searchNumber + " not found.");
        }

        System.out.println("\n--- Vehicle Type Statistics ---");
        int carCount = 0, busCount = 0, truckCount = 0;
        double carRevenue = 0, busRevenue = 0, truckRevenue = 0;

        for (Vehicle2 vehicle : vehicles) {
            double toll = vehicle.calculateToll();
            if (vehicle instanceof Car2) {
                carCount++;
                carRevenue += toll;
            } else if (vehicle instanceof Bus2) {
                busCount++;
                busRevenue += toll;
            } else if (vehicle instanceof Truck) {
                truckCount++;
                truckRevenue += toll;
            }
        }

        System.out.println("Cars: " + carCount + " | Revenue: $" + String.format("%.2f", carRevenue));
        System.out.println("Buses: " + busCount + " | Revenue: $" + String.format("%.2f", busRevenue));
        System.out.println("Trucks: " + truckCount + " | Revenue: $" + String.format("%.2f", truckRevenue));
        System.out.println("Total Vehicles: " + vehicles.length);

        sc.close();
    }
}
