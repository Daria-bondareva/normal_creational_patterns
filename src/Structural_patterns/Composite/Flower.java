package Structural_patterns.Composite;

public class Flower implements Plants{
    String name;
    public Flower(String name){
        this.name = name;
    }

    @Override
    public void Grow() {
        System.out.println(name + " grew in this greenhouse");
    }

    @Override
    public void Wilt() {
        System.out.println("Ooh, no! " + name + " has faded");
    }
}
