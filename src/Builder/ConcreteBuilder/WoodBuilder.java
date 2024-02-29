package Builder.ConcreteBuilder;


import Builder.Cutlery;
import Builder.CutleryBuilder;

public class WoodBuilder implements CutleryBuilder {
    public Cutlery cutlery;
    public WoodBuilder(){
        cutlery = new Cutlery();
    }
    @Override
    public void buildSpoon() {
        cutlery.setSpoon("wooden spoon");
    }

    @Override
    public void buildFofk() {
        cutlery.setFork("wooden fork");
    }

    @Override
    public void buildKnife() {
        cutlery.setKnife("wooden knife");
    }

    @Override
    public Cutlery getCutlery() {
        return cutlery;
    }
}
