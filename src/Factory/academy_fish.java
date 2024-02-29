package Factory;

public class academy_fish implements Academy_cooks{
    @Override
    public Cook createCooks() {
        return new Fish_cook();
    }
}
