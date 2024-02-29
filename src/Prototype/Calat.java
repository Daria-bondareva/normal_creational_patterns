package Prototype;

public class Calat implements Prototype{
    public String name;
    public Calat(String name){
        this.name = name;
    }
    @Override
    public Prototype doCopy() {
        return new Calat(name);
    }

    public String toString(){
        return "This salad has a name '" + name +"'";
    }
}
