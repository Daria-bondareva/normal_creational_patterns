package AbstractFactory;


import AbstractFactory.dishes.HotDog;
import AbstractFactory.dishes.Nuggets;
import AbstractFactory.dishes.dish;

public class FastFoodFactory extends TypeDishFactory{
    @Override
    public dish getDish(String type) {
        if("Hotdog".equalsIgnoreCase(type)){
            return new HotDog();
        } else{
            return new Nuggets();
        }
    }
}
