package AbstractFactory;

import AbstractFactory.dishes.dish;

public class Program {
    public static void main(String[] args){
        AbstractMenuFactory abstractMenuFactory = new AbstractMenuFactory();

        TypeDishFactory typeDishFactory1 = abstractMenuFactory.getTypeDishFactory("fastfood");
        dish first = typeDishFactory1.getDish("hotdog");
        System.out.println("first is cooking... " + first.cooking());
        dish second = typeDishFactory1.getDish("nuggets");
        System.out.println("second is cooking... " + second.cooking());

        TypeDishFactory typeDishFactory2 = abstractMenuFactory.getTypeDishFactory("soup");
        dish third = typeDishFactory2.getDish("Borsch");
        System.out.println("third is cooking... " + third.cooking());
        dish fourth = typeDishFactory2.getDish("solyanka");
        System.out.println("fourth is cooking... " + fourth.cooking());


    }

}
