
package Builder;

public class CutleryDirector {
    private CutleryBuilder cutleryBuilder = null;

    public CutleryDirector(CutleryBuilder cutleryBuilder){
        this.cutleryBuilder = cutleryBuilder;
    }

    public void constructCutlery(){
        cutleryBuilder.buildSpoon();
        cutleryBuilder.buildFofk();
        cutleryBuilder.buildKnife();
    }

    public Cutlery getCutlery(){
        return cutleryBuilder.getCutlery();
    }
}