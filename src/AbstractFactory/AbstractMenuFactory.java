package AbstractFactory;

public class AbstractMenuFactory {
    public TypeDishFactory getTypeDishFactory(String type){
        if("fastfood".equalsIgnoreCase(type)){
            return new FastFoodFactory();
        } else{
            return new SoupFactory();
        }
    }

}
