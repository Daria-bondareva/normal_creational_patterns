package Structural_patterns.Composite;

public class Project {
    public static void main(String[] args){
        Ecosystem ecosystem = new Ecosystem();

        Tree plant = new Tree("birch");
        Flower plant1 = new Flower("Rose");
        Flower plant2 = new Flower("Tulip");
        Tree plant3 = new Tree("Oak");
        Flower flower = new Flower("Cactus");
        Tree tree = new Tree("Maple");

        Ecosystem ecosystem1 = new Ecosystem();
        ecosystem1.addPlants(flower);
        ecosystem1.addPlants(tree);

        Ecosystem ecosystem2 = new Ecosystem();
        ecosystem2.addPlants(plant1);
        ecosystem2.addPlants(plant2);
        ecosystem2.addPlants(plant3);

        System.out.println("Hey, it's a new plant.. or plants?");
        plant.Grow();
        plant.Wilt();

         System.out.println("\nHey, it's a new plant.. or plants?");
        ecosystem1.Grow();

         System.out.println("\nHey, it's a new plant.. or plants?");
        ecosystem2.Grow();

    }
}
