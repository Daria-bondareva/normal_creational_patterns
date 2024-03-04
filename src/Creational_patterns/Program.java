package Creational_patterns;
import Creational_patterns.AbstractFactory.AbstractMenuFactory;
import Creational_patterns.AbstractFactory.TypeDishFactory;
import Creational_patterns.AbstractFactory.dishes.dish;
import Creational_patterns.Builder.ConcreteBuilder.MetalBuilder;
import Creational_patterns.Builder.ConcreteBuilder.WoodBuilder;
import Creational_patterns.Builder.Cutlery;
import Creational_patterns.Builder.CutleryBuilder;
import Creational_patterns.Builder.CutleryDirector;
import Creational_patterns.Factory.*;
import Creational_patterns.Prototype.Calat;
import Creational_patterns.Prototype.Steak;
import Creational_patterns.Singleton.Plate;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Select the number of the question to which you want to receive an answer !");
            System.out.println("1. Do you want to start an Abstract Factory?");
            System.out.println("2. Do you want to start an Builder?");
            System.out.println("3. Do you want to start an Factory?");
            System.out.println("4. Do you want to start an Prototype?");
            System.out.println("5. Do you want to start an Singleton ?");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    abstract_Factory();
                    break;
                case 2:
                    builder();
                    break;
                case 3:
                    factory();
                    break;
                case 4:
                    prototype();
                    break;
                case 5:
                    singleton();
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }while (option != 0);
    }

    private static void abstract_Factory() {
        AbstractMenuFactory abstractMenuFactory = new AbstractMenuFactory();

        TypeDishFactory typeDishFactory1 = abstractMenuFactory.getTypeDishFactory("fastfood");
        dish first = typeDishFactory1.getDish("hotdog");
        System.out.println("first is cooking... " + first.cooking());
        dish second = typeDishFactory1.getDish("nuggets");
        System.out.println("second is cooking... " + second.cooking());

        TypeDishFactory typeDishFactory2 = abstractMenuFactory.getTypeDishFactory("soup");
        dish third = typeDishFactory2.getDish("Borsch");
        System.out.println("third is cooking... " + third.cooking());
        dish fourth = typeDishFactory2.getDish("solyanka");
        System.out.println("fourth is cooking... " + fourth.cooking());

    }

    private static void builder() {

        CutleryBuilder cutleryBuilder = new WoodBuilder();
        CutleryDirector cutleryDirector = new CutleryDirector(cutleryBuilder);
        cutleryDirector.constructCutlery();
        Cutlery cutlery = cutleryDirector.getCutlery();
        System.out.println("Your cutlery is: " + cutlery);

        cutleryBuilder = new MetalBuilder();
        cutleryDirector = new CutleryDirector(cutleryBuilder);
        cutleryDirector.constructCutlery();
        Cutlery cutlery2 = cutleryDirector.getCutlery();
        System.out.println("Your cutlery is: " + cutlery2);
    }

    private static void factory(){
        Academy_cooks academyCooks = createBySpecialty("meat");
        Cook cook = academyCooks.createCooks();

        cook.Cooking();
    }

    static Academy_cooks createBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("confectionner")){
            return new academy_confectionner();
        }else if(specialty.equalsIgnoreCase("fish")){
            return new academy_fish();
        }else if(specialty.equalsIgnoreCase("meat")){
            return new academy_meat();
        }else{
            throw new RuntimeException(specialty + "is unknown");
        }
    }

    private static void prototype(){
        Calat calat_1 = new Calat("Caesar");
        System.out.println("Fisrt salat : "+ calat_1);
        Calat calat_2 = new Calat("Greek");
        System.out.println("Second salat : "+ calat_2);

        Steak steak_1 = new Steak("medium");
        System.out.println("Fisrt steak : "+ steak_1);
        Steak steak_2 = new Steak("rare");
        System.out.println("Second steak : "+ steak_2);

    }
    private static void singleton() {
            Plate plate = Plate.getInstance();
            plate.serving();

    }
}