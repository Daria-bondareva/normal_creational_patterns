package AbstractFactory;

import AbstractFactory.dishes.Borsch;
import AbstractFactory.dishes.Solyanka;
import AbstractFactory.dishes.dish;

public class SoupFactory extends TypeDishFactory{
    @Override
    public dish getDish(String type) {
        if("Borsch".equalsIgnoreCase(type)){
            return new Borsch();
        } else{
            return new Solyanka();
        }
    }
}
