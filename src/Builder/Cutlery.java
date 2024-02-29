//this is Product
package Builder;

public class Cutlery {
    private String spoon;
    private String fork;
    private String knife;

    public String getSpoon() {
        return spoon;
    }
    public void setSpoon(String spoon) {
        this.spoon = spoon;
    }
    public String getFork() {
        return fork;
    }
    public void setFork(String fork) {
        this.fork = fork;
    }
    public String getKnife() {
        return knife;
    }
    public void setKnife(String knife) {
        this.knife = knife;
    }

    public String toString(){
        return "spoon - " + spoon + "; fork - " + fork + "; knife - " + knife ;
    }
}
