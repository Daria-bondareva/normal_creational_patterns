package Prototype;

public class Steak implements Prototype{
    public String frying;
    public Steak(String frying){
        this.frying = frying;
    }

    @Override
    public Prototype doCopy() {
        return new Steak(frying);
    }

    public String toString(){
       return  "steak's frying is " + frying;
    }
}
