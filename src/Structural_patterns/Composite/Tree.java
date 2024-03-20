package Structural_patterns.Composite;

public class Tree implements Plants{
    String name;
    public Tree(String name){
        this.name = name;
    }

    @Override
    public void Grow() {
        System.out.println(name + " grew in this garden");
    }

    @Override
    public void Wilt() {
        System.out.println("Ooh, no! " + name + " withered");
    }
}
