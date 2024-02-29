package Builder.ConcreteBuilder;

import Builder.Cutlery;
import Builder.CutleryBuilder;

public class MetalBuilder implements CutleryBuilder {
    public Cutlery cutlery;
    public MetalBuilder(){
        cutlery = new Cutlery();
    }
    @Override
    public void buildSpoon() {
        cutlery.setSpoon("metal spoon");
    }

    @Override
    public void buildFofk() {
        cutlery.setFork("metal fork");
    }

    @Override
    public void buildKnife() {
        cutlery.setKnife("metal knife");
    }

    @Override
    public Cutlery getCutlery() {
        return cutlery;
    }
}
