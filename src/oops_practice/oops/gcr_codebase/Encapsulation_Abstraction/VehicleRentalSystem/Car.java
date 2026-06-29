package oops_practice.oops.gcr_codebase.Encapsulation_Abstraction.VehicleRentalSystem;

public class Car extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}