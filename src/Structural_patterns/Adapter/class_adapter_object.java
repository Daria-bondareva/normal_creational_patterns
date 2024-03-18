package Structural_patterns.Adapter;

public class class_adapter_object implements distanceCounter{
    kilometr_counter kilometrCounter;
    public class_adapter_object(){
        kilometrCounter = new kilometr_counter();
    }

    @Override
    public double getDistanceInKilometer() {
        return kilometrCounter.getDistanceInKilometr();
    }

    @Override
    public void setDistanceInKilometer(double distanceInKilometer) {
        kilometrCounter.setDistanceInKilometr(distanceInKilometer);
    }
    @Override
    public double getDistanceInMileage() {
        return distInMil(kilometrCounter.getDistanceInKilometr());
    }

    @Override
    public void setDistanceInMileage(double DistanceInMileage) {
        kilometrCounter.setDistanceInKilometr(distKil(DistanceInMileage));
    }



    private double distInMil(double kilom){
        return (kilom * 0.621371);
    }

    private double distKil(double mil){
        return (mil * 1.60934);
    }

}
