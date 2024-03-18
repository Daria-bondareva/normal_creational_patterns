package Structural_patterns.Adapter;

public class class_adapter extends kilometr_counter implements distanceCounter {


    @Override
    public double getDistanceInKilometer() {
        return distanceInKilometr;
    }

    @Override
    public void setDistanceInKilometer(double distanceInKilometer) {
        this.distanceInKilometr = distanceInKilometer;
    }
    @Override
    public double getDistanceInMileage() {
        return distInMil(distanceInKilometr);
    }

    @Override
    public void setDistanceInMileage(double DistanceInMileage) {
        this.distanceInKilometr = distKil(DistanceInMileage);
    }

    private double distInMil(double kilom){
        return (kilom * 0.621371);
    }

    private double distKil(double mil){
        return (mil * 1.60934);
    }

}
