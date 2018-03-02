import oop.RestaurantDish;

public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(75, "Pad Thai", true);

        dish.setCostInCents(95);
        dish.setNameOfDish("CheeseBurger");
        dish.setWouldRecommend(false);


        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());

        dish.eat();



    }
}
