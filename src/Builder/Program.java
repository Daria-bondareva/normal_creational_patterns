package Builder;


import Builder.ConcreteBuilder.MetalBuilder;
import Builder.ConcreteBuilder.WoodBuilder;

public class Program {
    public static void main(String[] args) {

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
}
