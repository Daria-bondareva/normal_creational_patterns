package Factory;

public class academy_meat implements Academy_cooks{
    @Override
    public Cook createCooks() {
        return new Meat_chef();
    }
}
