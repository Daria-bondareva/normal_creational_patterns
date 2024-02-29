package AbstractFactory;

import AbstractFactory.dishes.dish;

public abstract class  TypeDishFactory {
    public abstract dish getDish(String type);
}
