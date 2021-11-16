import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) {
        Restaurant restaurant = new Restaurant("any", "adfg", LocalTime.parse("10.25.40"), LocalTime.parse("12.50.24") );

        if (restaurant.getName().equals(restaurantName)){
            return restaurant;}
        else {return null;}
    }

    //This method displays the total order value when all items are selected
    public List<Restaurant> orderValue(){
        Restaurant restaurant = new Restaurant("any", "adfg", LocalTime.parse("10.25.40"), LocalTime.parse("12.50.24") );


    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
