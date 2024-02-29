package Singleton;

public class Program {
    public static void main(String[] args) {
        Plate plate = Plate.getInstance();
        plate.serving();
    }
}
