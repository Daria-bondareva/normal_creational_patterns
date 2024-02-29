package Singleton;

public class Plate {
    private static Plate plate;
    private Plate(){

    }

    public static Plate getInstance(){
        if(plate == null){
            plate = new Plate();
        }
        return plate;
    }

    public void serving(){
        System.out.println(" * brought a new plate * ");
    }
}
