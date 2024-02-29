package Prototype;

public class Program {
    public static void main(String[] args){
        Calat calat_1 = new Calat("Caesar");
        System.out.println("Fisrt salat : "+ calat_1);
        Calat calat_2 = new Calat("Greek");
        System.out.println("Second salat : "+ calat_2);

        Steak steak_1 = new Steak("medium");
        System.out.println("Fisrt steak : "+ steak_1);
        Steak steak_2 = new Steak("rare");
        System.out.println("Second steak : "+ steak_2);

    }
}
