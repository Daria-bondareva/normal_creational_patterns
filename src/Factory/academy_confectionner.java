package Factory;

public class academy_confectionner implements Academy_cooks{
    @Override
    public Cook createCooks() {
        return new Confectionner();
    }
}

